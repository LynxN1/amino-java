package amino;

import amino.exceptions.Exceptions;
import amino.exceptions.InvalidPassword;
import amino.models.requests.LoginBody;
import amino.models.response.account.AccountData;
import amino.models.response.aminoapps.LoginResponse;
import amino.models.response.link_info.LinkInfoResponse;
import amino.models.response.sub_clients.CommunitiesData;
import amino.rest.RestService;
import amino.utils.Headers;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import javax.security.auth.login.LoginException;
import java.util.Objects;
import java.util.UUID;

public class Client {
  public RestService retrofit = Client.getRetrofit();
  public AccountData account;
  public Headers headers = new Headers();
  private final OkHttpClient okClient = new OkHttpClient();
  private final Gson gson = new Gson();

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

  public void loginAminoapps(String email, String password) throws Exception {
    String json = "{\n" +
            "\"auth_type\": 0,\n" +
            "\"email\": \"" + email + "\",\n" +
            "\"recaptcha_challenge\": \"03AGdBq24RkJRzNVql43ZETbuzHfaUG0VVqx4U9uRqwaCHYbyGDG-KlxP7GAdUKM-A9ajDP_ZkB9PlVL8lJ312U9vkk0lI9J92JwLR6obxq-A5NTeABdzUaWfJY5aGcLPKX31q3O8rAvd7QPOBybvjhmgHZQlZ3Z1gf1tJpyCP3rrTEsTjsM6f_h68_IYh7MLuf3ut9fkMoQiJLyaAV9ZGT5I_5dhAfxSFyFAsrv0tGpre2m8AFakm4k5SYO_W_6c2Nrl84fZdsqnrdjoHdGAOPbP73ZR1afPrqQo_e01nRJb7sIstx4Y3wBsSm2B8Yf3s4HsVrBkyXj0UTY1NlCdnzGIIKAp92xjp6RZlausFk_MDD1t9DJhGGzYaNMyVoCNTMvFULs9sQZsUs7D25slbOjBlwNx5Rj8kIbNu-BHL498wj8-wRGb3MB33Q8IEAaAmk9EVjksDcWzi\",\n" +
            "\"recaptcha_version\": \"v3\",\n" +
            "\"secret\": \"" + password + "\"\n" +
            "}";
    RequestBody body = RequestBody.create(
            MediaType.parse("application/json"), json);
    Request request = new Request.Builder()
            .url("https://aminoapps.com/api/auth")
            .header("Content-Type", "application/json")
            .header("Accept", "*/*")
            .header("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:91.0) Gecko/20100101 Firefox/91.0")
            .post(body)
            .build();
    okhttp3.Call call = okClient.newCall(request);
    okhttp3.Response response = call.execute();
    String resBody = response.body().string();
    try {
      LoginResponse loginResponse = gson.fromJson(resBody, LoginResponse.class);
      if (loginResponse.getResult().getUid() != null) {
        headers.AUID = loginResponse.getResult().getUid();
        headers.SID = response.headers("set-cookie").get(0).split(";")[0].substring(4);
      } else {
        throw new LoginException("Login failed");
      }
    } catch (Exception e) {
      throw new InvalidPassword("Invalid email or password");
    }
  }

  public void watchAd() throws Exception {
    String eventId = UUID.randomUUID().toString();
    String id = UUID.randomUUID().toString();
    String json = "{\"reward\":{\"ad_unit_id\":\"ca-app-pub-3344299053780036/3550853079\",\"credentials_type\":\"publisher\",\"custom_json\":{\"hashed_user_id\":\"" + account.getAuid() + "\"},\"demand_type\":\"sdk_demand\",\"event_id\":\"" + eventId + "\",\"network\":\"admob\",\"placement_tag\":\"default\",\"reward_name\":\"Amino Coin\",\"reward_valid\":true,\"reward_value\":2,\"shared_id\":\"" + id + "\",\"version_id\":\"1569147951493\",\"waterfall_id\":\"" + id + "\"},\"app\":{\"bundle_id\":\"com.narvii.amino.master\",\"current_orientation\":\"portrait\",\"release_version\":\"3.4.33572\",\"user_agent\":\"Dalvik/2.1.0 (Linux; U; Android 7.1.2; SM-G965N Build/star2ltexx-user 7.1.; com.narvii.amino.master/3.4.33572)\"},\"date_created\":1626186732,\"device_user\":{\"country\":\"US\",\"device\":{\"architecture\":\"i686\",\"carrier\":{\"country_code\":255,\"name\":\"Golden Telecom\",\"network_code\":0},\"is_phone\":false,\"model\":\"SM-G965N\",\"model_type\":\"samsung\",\"operating_system\":\"android\",\"operating_system_version\":\"25\",\"screen_size\":{\"height\":1920,\"resolution\":2,\"width\":1080}},\"do_not_track\":false,\"idfa\":\"a51d56b0-9240-4436-9466-6b755b0ac3c1\",\"ip_address\":\"\",\"locale\":\"en\",\"timezone\":{\"location\":\"Africa/Nairobi\",\"offset\":\"GMT+03:00\"},\"volume_enabled\":true},\"session_id\":\"317ae228-be6e-4b0f-a588-01a5a8ce33c8\"}";
    RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
    Request request = new Request.Builder()
            .url("https://ads.tapdaq.com/v4/analytics/reward")
            .header("Authorization", "Basic NWJiNTM0OWUxYzlkNDQwMDA2NzUwNjgwOmM0ZDJmYmIxLTVlYjItNDM5MC05MDk3LTkxZjlmMjQ5NDI4OA==")
            .post(body)
            .build();
    okhttp3.Call call = okClient.newCall(request);
    okhttp3.Response response = call.execute();
    if (!response.isSuccessful()) {
      throw new Exception("Watch ad exception");
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
