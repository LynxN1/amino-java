package amino;

import amino.exceptions.Exceptions;
import amino.models.requests.*;
import amino.models.response.account.AccountData;
import amino.models.response.event_log.EventLogResponse;
import amino.models.response.link_info.LinkInfoResponse;
import amino.models.response.sub_clients.CommunitiesData;
import amino.models.response.wallet.WalletResponse;
import amino.rest.OkClient;
import amino.rest.RestService;
import amino.rest.RetrofitClient;
import amino.utils.Headers;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import retrofit2.Response;

import java.util.Objects;
import java.util.UUID;

public class Client {
  public RestService retrofit = RetrofitClient.getRetrofit();
  public AccountData account;
  public Headers headers = new Headers();
  public final Gson gson = new Gson();


  public void login(String email, String password) throws Exception {
    var body = new LoginBody();
    body.setEmail(email);
    body.setDeviceID(headers.DEVICEID);
    body.setSecret("0 " + password);
    Response<AccountData> res = retrofit.auth(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
    AccountData accountData = res.body();
    headers.SID = Objects.requireNonNull(accountData).getSid();
    account = accountData;
    headers.AUID = accountData.getAuid();
  }

//  public void loginAminoapps(String email, String password) throws Exception {
//    var jsonModel = new LoginAminoappsBody();
//    jsonModel.setEmail(email);
//    jsonModel.setSecret(password);
//    jsonModel.setRecaptchaChallenge("03AGdBq24RkJRzNVql43ZETbuzHfaUG0VVqx4U9uRqwaCHYbyGDG-KlxP7GAdUKM-A9ajDP_ZkB9PlVL8lJ312U9vkk0lI9J92JwLR6obxq-A5NTeABdzUaWfJY5aGcLPKX31q3O8rAvd7QPOBybvjhmgHZQlZ3Z1gf1tJpyCP3rrTEsTjsM6f_h68_IYh7MLuf3ut9fkMoQiJLyaAV9ZGT5I_5dhAfxSFyFAsrv0tGpre2m8AFakm4k5SYO_W_6c2Nrl84fZdsqnrdjoHdGAOPbP73ZR1afPrqQo_e01nRJb7sIstx4Y3wBsSm2B8Yf3s4HsVrBkyXj0UTY1NlCdnzGIIKAp92xjp6RZlausFk_MDD1t9DJhGGzYaNMyVoCNTMvFULs9sQZsUs7D25slbOjBlwNx5Rj8kIbNu-BHL498wj8-wRGb3MB33Q8IEAaAmk9EVjksDcWzi");
//    RequestBody body = RequestBody.create(MediaType.parse("application/json"), gson.toJson(jsonModel));
//    Request request = new Request.Builder()
//            .url("https://aminoapps.com/api/auth")
//            .header("Content-Type", "application/json")
//            .header("Accept", "*/*")
//            .header("User-Agent", "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:91.0) Gecko/20100101 Firefox/91.0")
//            .post(body)
//            .build();
//    okhttp3.Response response = OkClient.getOkCall(request);
//    String resBody = Objects.requireNonNull(response.body()).string();
//    try {
//      LoginResponse loginResponse = gson.fromJson(resBody, LoginResponse.class);
//      if (loginResponse.getResult().getUid() != null) {
//        headers.AUID = loginResponse.getResult().getUid();
//        headers.SID = response.headers("set-cookie").get(0).split(";")[0].substring(4);
//      } else {
//        throw new LoginException("Login failed");
//      }
//    } catch (Exception e) {
//      throw new InvalidPassword("Invalid email or password");
//    }
//  }

  public void watchAd() throws Exception {
    String eventId = UUID.randomUUID().toString();
    String id = UUID.randomUUID().toString();
    String json = "{\"reward\":{\"ad_unit_id\":\"ca-app-pub-3344299053780036/3550853079\",\"credentials_type\":\"publisher\",\"custom_json\":{\"hashed_user_id\":\"" + headers.AUID + "\"},\"demand_type\":\"sdk_demand\",\"event_id\":\"" + eventId + "\",\"network\":\"admob\",\"placement_tag\":\"default\",\"reward_name\":\"Amino Coin\",\"reward_valid\":true,\"reward_value\":2,\"shared_id\":\"" + id + "\",\"version_id\":\"1569147951493\",\"waterfall_id\":\"" + id + "\"},\"app\":{\"bundle_id\":\"com.narvii.amino.master\",\"current_orientation\":\"portrait\",\"release_version\":\"3.4.33572\",\"user_agent\":\"Dalvik/2.1.0 (Linux; U; Android 7.1.2; SM-G965N Build/star2ltexx-user 7.1.; com.narvii.amino.master/3.4.33572)\"},\"date_created\":1626186732,\"device_user\":{\"country\":\"US\",\"device\":{\"architecture\":\"i686\",\"carrier\":{\"country_code\":255,\"name\":\"Golden Telecom\",\"network_code\":0},\"is_phone\":false,\"model\":\"SM-G965N\",\"model_type\":\"samsung\",\"operating_system\":\"android\",\"operating_system_version\":\"25\",\"screen_size\":{\"height\":1920,\"resolution\":2,\"width\":1080}},\"do_not_track\":false,\"idfa\":\"a51d56b0-9240-4436-9466-6b755b0ac3c1\",\"ip_address\":\"\",\"locale\":\"en\",\"timezone\":{\"location\":\"Africa/Nairobi\",\"offset\":\"GMT+03:00\"},\"volume_enabled\":true},\"session_id\":\"317ae228-be6e-4b0f-a588-01a5a8ce33c8\"}";
    RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
    Request request = new Request.Builder()
            .url("https://ads.tapdaq.com/v4/analytics/reward")
            .header("Authorization", "Basic NWJiNTM0OWUxYzlkNDQwMDA2NzUwNjgwOmM0ZDJmYmIxLTVlYjItNDM5MC05MDk3LTkxZjlmMjQ5NDI4OA==")
            .post(body)
            .build();
    okhttp3.Response response = OkClient.getOkCall(request);
    if (!response.isSuccessful()) {
      response.close();
      throw new Exception("Watch ad exception");
    }
    response.close();
  }

  public void registerCheck(String email, String deviceId) throws Exception {
    var body = new RegisterCheckBody();
    body.setEmail(email);
    body.setDeviceId(deviceId);
    Response<JsonObject> res = retrofit.registerCheck(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }

  public EventLogResponse getEventLog(String language) throws Exception {
    Response<EventLogResponse> res = retrofit.eventLog(headers.getHeaders(), language).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
    return res.body();
  }

  public void requestValidationCode(String email, String deviceId) throws Exception {
    var body = new RequestValidationCodeBody();
    body.setEmail(email);
    body.setDeviceId(deviceId);
    Response<JsonObject> res = retrofit.requestValidationCode(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }

  public JsonObject register(String email, String password, String nickname, String code, String deviceId) throws Exception {
    var body = new RegisterBody();
    body.setEmail(email);
    body.setPassword(password);
    body.setDeviceId(deviceId);
    body.setNickname(nickname);
    var validationContext = new ValidationContext();
    validationContext.setIdentity(email);
    var data = new Data();
    data.setCode(code);
    validationContext.setData(data);
    body.setValidationContext(validationContext);
    Response<JsonObject> res = retrofit.register(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
    return res.body();
  }

  public CommunitiesData getSubClients(int start, int size) throws Exception {
    Response<CommunitiesData> res = retrofit.getSubClients(headers.getHeaders(), start, size).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
    return res.body();
  }

  public LinkInfoResponse getFromCode(String code) throws Exception {
    Response<LinkInfoResponse> res = retrofit.getFromCode(headers.getHeaders(), code).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
    return res.body();
  }

  public WalletResponse getWalletInfo() throws Exception {
    Response<WalletResponse> res = retrofit.getWalletInfo(headers.getHeaders()).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
    return res.body();
  }

  public void checkDevice() throws Exception {
    var body = new CheckDeviceBody();
    body.setDeviceID(headers.DEVICEID);
    Response<JsonObject> res = retrofit.checkDevice(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }

  public void joinCommunity(String comId) throws Exception {
    var body = new JoinCommunityBody();
    Response<JsonObject> res = retrofit.joinCommunity(headers.getHeaders(gson.toJson(body)), comId, body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }

  public void requestVerifyCode(String email) throws Exception {
    var body = new RequestVerifyBody();
    body.setDeviceID(headers.DEVICEID);
    body.setIdentity(email);
    Response<JsonObject> res = retrofit.requestVerifyCode(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }

  public void verify(String email, String code) throws Exception {
    var body = new VerifyBody();
    body.setDeviceID(headers.DEVICEID);
    var validationContext = new ValidationContext();
    validationContext.setIdentity(email);
    var data = new Data();
    data.setCode(code);
    validationContext.setData(data);
    body.setValidationContext(validationContext);
    Response<JsonObject> res = retrofit.verify(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }

  public void activateAccount(String email, String code) throws Exception {
    var body = new ActivateAccountBody();
    body.setDeviceID(headers.DEVICEID);
    body.setIdentity(email);
    var data = new Data();
    data.setCode(code);
    body.setData(data);
    Response<JsonObject> res = retrofit.activateAccount(headers.getHeaders(gson.toJson(body)), body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }

  public void buildPostRequest(String url, Object body, String sig) throws Exception {
    Response<JsonObject> res = retrofit.customPostRequest(headers.getHeadersWithSig(sig), url, body).execute();
    if (!res.isSuccessful()) {
      new Exceptions(Objects.requireNonNull(res.errorBody()).charStream()).checkException();
    }
  }
}
