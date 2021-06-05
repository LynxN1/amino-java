package amino;

import amino.headers.DeviceInfo;
import amino.models.requests.*;
import amino.rest.RestService;
import amino.headers.Headers;
import amino.models.response.account.AccountData;
import amino.models.response.link_info.LinkInfo;
import amino.models.response.ndc_account.NdcAccount;
import amino.models.response.sub_clients.CommunitiesData;
import amino.models.response.thread_list.ThreadList;
import amino.utils.HashingUtility;
import amino.utils.TimeUtils;
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
import java.util.Objects;


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

  private AccountData login(String email, String password) throws IOException, LoginException {
    LoginBody body = new LoginBody()
        .email(email)
        .v(2)
        .secret(password)
        .deviceId(DeviceInfo.deviceId)
        .clientType(100)
        .action("normal");
    Call<AccountData> res = client.auth(Headers.setHeaders(), body);

    Response<AccountData> accountDataResponse = res.execute();
    if (accountDataResponse.isSuccessful()) {
      AccountData accountData = accountDataResponse.body();
      if (accountData != null) {
        Headers.SID = accountData.getSid();
        Headers.AUID = accountData.getAuid();
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
      SendMessageBody body = new SendMessageBody()
              .type(0)
              .content(message);
      Call<JsonObject> res = client.sendMessage(
              Headers.setHeaders(),
              comId,
              chatId,
              body
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println("SendMessage");
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void sendMessage(String message, String chatId, Integer type) {
      SendMessageBody body = new SendMessageBody()
              .type(type)
              .content(message);
      Gson gson = new Gson();
      String maxJson = gson.toJson(body);
      System.out.println(maxJson);
      Call<JsonObject> res = client.sendMessage(
              Headers.setHeaders(),
              comId,
              chatId,
              body
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println("SendMessage");
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void checkIn() {
      CheckInBody body = new CheckInBody();
      Call<JsonObject> res = client.checkIn(
              Headers.setHeaders(),
              comId,
              body
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void playLottery() {
      PlayLotteryBody body = new PlayLotteryBody();
      Call<JsonObject> res = client.playLottery(
              Headers.setHeaders(),
              comId,
              body
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void sendCoins(Integer coins, String blogId) {
      SendCoinsBody body = new SendCoinsBody()
              .coins(coins);
      Call<JsonObject> res = client.sendCoins(
              Headers.setHeaders(),
              comId,
              blogId,
              body
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void joinChat(String chatId) {
      Call<JsonObject> res = client.joinChat(
              Headers.setHeaders(),
              comId,
              chatId,
              Headers.AUID
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void leaveChat(String chatId) {
      Call<JsonObject> res = client.leaveChat(
              Headers.setHeaders(),
              comId,
              chatId,
              Headers.AUID
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void postActivity() {
      // TODO Invalid request
      int unixTime = TimeUtils.unixInstant();
      UserActiveTimeChunkListItem timers = new UserActiveTimeChunkListItem()
              .start(unixTime-300)
              .end(unixTime);
      UserActiveTimeBody body = new UserActiveTimeBody()
              .timezone(7)
              .optInAdsFlags(2147483647)
              .userActiveTimeChunkList(List.of(timers));
      try {
        Gson gson = new Gson();
        System.out.println(gson.toJson(body));
        Headers.SIG = HashingUtility.computeSignature(gson.toJson(body));
      } catch (GeneralSecurityException e) {
        e.printStackTrace();
      }
      Call<JsonObject> res = client.postActivity(
              Headers.setHeaders(),
              comId
      );
      try {
        Response<JsonObject> result = res.execute();
        if (!result.isSuccessful()) {
          System.out.println(Objects.requireNonNull(result.errorBody()).string());
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
