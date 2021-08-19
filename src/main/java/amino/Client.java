package amino;

import amino.exceptions.Exceptions;
import amino.models.requests.LoginBody;
import amino.models.response.account.AccountData;
import amino.models.response.link_info.LinkInfoResponse;
import amino.models.response.sub_clients.CommunitiesData;
import amino.rest.RestService;
import amino.utils.Headers;
import java.util.Objects;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {
  public RestService retrofit = Client.getRetrofit();
  public AccountData account;
  public Headers headers = new Headers();

  private static RestService getRetrofit() {
    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://service.narvii.com/api/v1/").addConverterFactory(GsonConverterFactory.create()).build();
    return retrofit.create(RestService.class);
  }

  public void login(String email, String password) throws Exception {
    LoginBody body = new LoginBody().email(email).v(2).secret(password).deviceId(headers.deviceId).clientType(100).action("normal");
    Call<AccountData> res = retrofit.auth(headers.getHeaders(), body);
    Response<AccountData> accountDataResponse = res.execute();
    if (accountDataResponse.isSuccessful()) {
      AccountData accountData = accountDataResponse.body();
      headers.SID = Objects.requireNonNull(accountData).getSid();
      headers.AUID = accountData.getAuid();
      account = accountData;
    } else {
      new Exceptions(Objects.requireNonNull(accountDataResponse.errorBody()).charStream()).checkException();
    }
  }

  public CommunitiesData getSubClients(int start, int size) throws Exception {
    Call<CommunitiesData> res = retrofit.getSubClients(headers.getHeaders(), start, size);
    Response<CommunitiesData> communitiesDataResponse = res.execute();
    if (communitiesDataResponse.isSuccessful()) {
      return communitiesDataResponse.body();
    }
    new Exceptions(Objects.requireNonNull(communitiesDataResponse.errorBody()).charStream()).checkException();
    return null;
  }

  public LinkInfoResponse getFromCode(String code) throws Exception {
    Call<LinkInfoResponse> res = retrofit.getFromCode(headers.getHeaders(), code);
    Response<LinkInfoResponse> linkInfoResponse = res.execute();
    if (linkInfoResponse.isSuccessful()) {
      return linkInfoResponse.body();
    }
    new Exceptions(Objects.requireNonNull(linkInfoResponse.errorBody()).charStream()).checkException();
    return null;
  }
}
