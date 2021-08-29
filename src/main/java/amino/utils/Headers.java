package amino.utils;

import amino.Client;
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

  private String getSignature(String json) throws Exception {
    RequestBody body = RequestBody.create(MediaType.parse("application/json"), json);
    Request request = new Request.Builder()
            .url("https://aminocoins.ru:8088/api/narvii/signature")
            .header("apikey", "id")
            .post(body)
            .build();
    okhttp3.Response response = OkClient.getOkCall(request);
    if (!response.isSuccessful()) {
      throw new Exception("getSignature request exception");
    }
    return Objects.requireNonNull(response.body()).string();
  }
  
  public Map<String, String> getHeaders() {
    HashMap<String, String> headers_map = new HashMap<>();
    headers_map.put("NDCDEVICEID", DEVICEID);
    headers_map.put("Accept-Language", "en-US");
    headers_map.put("Content-Type", "application/json; charset=utf-8");
    headers_map.put("Host", "service.narvii.com");

    if (SID != null) {
      headers_map.put("NDCAUTH", "sid=" + SID);
    }
    return headers_map;
  }

  public Map<String, String> getHeaders(String data) throws Exception {
    HashMap<String, String> headers_map = new HashMap<>();
    headers_map.put("NDCDEVICEID", DEVICEID);
    headers_map.put("Accept-Language", "en-US");
    headers_map.put("Content-Type", "application/json; charset=utf-8");
    headers_map.put("Host", "service.narvii.com");
    headers_map.put("NDC-MSG-SIG", getSignature(data));
    headers_map.put("Content-Length", String.valueOf(data.length()));

    if (SID != null) {
      headers_map.put("NDCAUTH", "sid=" + SID);
    }
    return headers_map;
  }
}
