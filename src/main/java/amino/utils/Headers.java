package amino.utils;

import java.util.HashMap;
import java.util.Map;

public class Headers {
  public String SID;
  public String AUID;
  public String DEVICEID = "22678384F776535FBF815D7B5450022B8419E616E6EFFB5C18A0C74768A49D6A66D6F6599FC067394B";

  public Map<String, String> getHeaders() {
    HashMap<String, String> headers_map = new HashMap<>();
    headers_map.put("Accept-Language", "en");
    headers_map.put("NDCDEVICEID", this.DEVICEID);
    headers_map.put("Host", "service.narvii.com");
    headers_map.put("Content-Type", "application/json; charset=utf-8");
    if (this.AUID != null) {
      headers_map.put("AUID", this.AUID);
    }
    if (this.SID != null) {
      headers_map.put("NDCAUTH", "sid=" + this.SID);
    }
    return headers_map;
  }

  public Map<String, String> getHeaders(String sig) {
    HashMap<String, String> headers_map = new HashMap<>();
    headers_map.put("Accept-Language", "en");
    headers_map.put("NDCDEVICEID", this.DEVICEID);
    headers_map.put("Host", "service.narvii.com");
    headers_map.put("Content-Type", "application/json; charset=utf-8");
    if (this.AUID != null) {
      headers_map.put("AUID", this.AUID);
    }
    if (this.SID != null) {
      headers_map.put("NDCAUTH", "sid=" + this.SID);
    }
    if (sig != null) {
      headers_map.put("NDC-MSG-SIG", sig);
    }
    return headers_map;
  }
}
