package amino.headers;

import java.util.HashMap;
import java.util.Map;

public class Headers {

  public static String SID;
  public static String SIG;
  public static String AUID;

  public static Map<String, String> setHeaders() {
    Map<String, String> headers_map = new HashMap<>();
    headers_map.put("Accept-Language", "ru-UA");
    headers_map.put("NDCDEVICEID", DeviceInfo.deviceId);
    if (AUID != null) {
      headers_map.put("AUID", AUID);
    }
    if (SID != null) {
      headers_map.put("NDCAUTH", "sid=" + SID);
    }
    if (SIG != null) {
      headers_map.put("NDC-MSG-SIG", SIG);
    }
    return headers_map;
  }
}