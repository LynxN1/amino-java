package aki.client;

import aki.headers.Headers;
import aki.pojo.requests.LoginBody;
import aki.pojo.requests.SendMessageBody;
import aki.pojo.requests.UserActiveTimeBody;
import aki.pojo.requests.UserActiveTimeChunkListItem;
import aki.pojo.response.account.AccountData;
import aki.pojo.response.link_info.LinkInfo;
import aki.pojo.response.ndc_account.NdcAccount;
import aki.pojo.response.sub_clients.CommunitiesData;
import aki.pojo.response.thread_list.ThreadList;
import aki.utils.HashingUtility;
import aki.utils.TimeUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.security.auth.login.LoginException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

import static aki.headers.Headers.deviceId;

public class Client {
  static RestService client = getClient();

  static RestService getClient() {
    Retrofit retrofit = new Retrofit.Builder()
        .baseUrl("https://service.narvii.com/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build();
    return retrofit.create(RestService.class);
  }

  public AccountData tryLogin(String email, String password) {
    try {
      return login(email, password);
    } catch (IOException | LoginException e) {
      e.printStackTrace();
    }
    return null;
  }

  public AccountData login(String email, String password) throws IOException, LoginException {
    int unixTime = TimeUtils.unixInstant();
    LoginBody body = new LoginBody()
        .email(email)
        .v(2)
        .secret(password)
        .deviceId(deviceId)
        .clientType(100)
        .action("normal")
        .timestamp(unixTime);
    Call<AccountData> res = client.auth(Headers.setHeaders(), body);

    Response<AccountData> accountDataResponse = res.execute();
    if (accountDataResponse.isSuccessful()) {
      AccountData accountData = accountDataResponse.body();
      if (accountData != null) {
        Headers.SID = accountData.getSid();
      }
      return accountData;
    }

    ResponseBody responseBody = accountDataResponse.errorBody();
    if (responseBody != null) {
      System.out.print(responseBody.string());
    }
    throw new LoginException("Login failed");
  }

  public CommunitiesData getSubClients(int start, int size) {
    Call<CommunitiesData> res = client.getSubClients(Headers.setHeaders(), start, size);
    try {
      return res.execute().body();
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }

  public LinkInfo getFromCode(String code) {
    Call<LinkInfo> res = client.getFromCode(
            Headers.setHeaders(),
            code
    );
    try {
      return res.execute().body();
    } catch (IOException e) {
      e.printStackTrace();
      return null;
    }
  }


  public static class SubClient {
    private final String comId;

    public SubClient(String comId) {
      this.comId = comId;
    }

    public NdcAccount getUserInfo(String userId) {
      if (comId == null) {
        System.out.println("Invalid comId");
        return null;
      }
      Call<NdcAccount> res = client.getAccountData(
              Headers.setHeaders(),
              comId,
              userId
      );
      try {
        return res.execute().body();
      } catch (IOException e) {
        e.printStackTrace();
        return null;
      }
    }

    public ThreadList getChatThreads(String type, int start, int size) {
      if (comId == null) {
        System.out.println("Invalid comId");
        return null;
      }
      Call<ThreadList> res = client.getChatThreads(
              Headers.setHeaders(),
              comId,
              type,
              start,
              size
      );
      try {
        return res.execute().body();
      } catch (IOException e) {
        e.printStackTrace();
        return null;
      }
    }

    public void sendMessage(String message, String chatId) {
      if (comId == null) {
        System.out.println("Invalid comId");
        return;
      }
      SendMessageBody body = new SendMessageBody();
      body.type = 0;
      body.content = message;
      Call<JsonObject> res = client.sendMessage(
              Headers.setHeaders(),
              comId,
              chatId,
              body
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(result.errorBody().string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void postActivity(String userId) {
      // Not working :/
      if (comId == null) {
        System.out.println("Invalid comId");
        return;
      }
      int unixTime = TimeUtils.unixInstant();
      UserActiveTimeChunkListItem timers = new UserActiveTimeChunkListItem()
              .start(unixTime-300)
              .end(unixTime);
      UserActiveTimeBody body = new UserActiveTimeBody()
              .timezone(7)
              .timestamp(unixTime)
              .optInAdsFlags(2147483647)
              .userActiveTimeChunkList(List.of(timers));
      Gson gson = new Gson();
      try {
        System.out.println(gson.toJson(body));
        Headers.SIG = HashingUtility.computeSignature(gson.toJson(body));
        Headers.AUID = userId;
      } catch (GeneralSecurityException e) {
        e.printStackTrace();
      }
      System.out.println(Headers.setHeaders());
      Call<JsonObject> res = client.postActivity(
              Headers.setHeaders(),
              comId
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(result.errorBody().string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public String getComId() {
      return comId;
    }
  }
}
