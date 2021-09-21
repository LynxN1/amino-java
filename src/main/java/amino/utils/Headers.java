package amino.utils;

import amino.rest.OkClient;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Headers {
  public String SID;
  public String AUID;
  public String DEVICEID = "22678384F776535FBF815D7B5450022B8419E616E6EFFB5C18A0C74768A49D6A66D6F6599FC067394B";

  public String getSignature(String json) throws Exception {
    RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
    Request request = new Request.Builder()
            .url("https://aminocoins.ru:8088/api/narvii/signature")
            .header("apikey", "sig:all//zx")
            .post(body)
            .build();
    okhttp3.Response response = OkClient.getOkCall(request);
    if (!response.isSuccessful()) {
      throw new Exception("getSignature request exception");
    }
    return Objects.requireNonNull(response.body()).string();
  }

  public static String getDeviceId() throws Exception {
    Request request = new Request.Builder()
            .url("https://aminocoins.ru:8088/api/narvii/device")
            .header("apikey", "sig:all//zx")
            .get()
            .build();
    okhttp3.Response response = OkClient.getOkCall(request);
    if (!response.isSuccessful()) {
      throw new Exception("getDeviceId request exception");
    }
    return Objects.requireNonNull(response.body()).string();
  }

  private Map<String, String> getBaseHeaders() {
    HashMap<String, String> headers_map = new HashMap<>();
    headers_map.put("NDCDEVICEID", DEVICEID);
    headers_map.put("Accept-Language", "en-US");
    headers_map.put("Content-Type", "application/json; charset=utf-8");
    headers_map.put("User-Agent", "Dalvik/2.1.0 (Linux; U; Android 5.1.1; SM-N976N Build/d2que-user 5.1.1 QP1; com.narvii.amino.master/3.4.33581)");
    headers_map.put("Host", "service.narvii.com");

    if (SID != null)
      headers_map.put("NDCAUTH", "sid=" + SID);
    if (AUID != null)
      headers_map.put("AUID", AUID);
    return headers_map;
  }
  
  public Map<String, String> getHeaders() {
    return getBaseHeaders();
  }

  public Map<String, String> getHeaders(String data) throws Exception {
    var headers = getBaseHeaders();
    headers.put("NDC-MSG-SIG", getSignature(data));
    return headers;
  }
}
