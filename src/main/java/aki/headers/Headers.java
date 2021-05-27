package aki.headers;

import java.util.HashMap;
import java.util.Map;

public class Headers {

  public static String deviceId = "01C1B9B8A82A651FD387E19E2679823416C9A964166D74FDC5ECDC93651F9F9B4C8F5936B660DEE753";
  public static String SID;
  public static String SIG;
  public static String AUID;

  public static Map<String, String> setHeaders() {
    Map<String, String> headers_map = new HashMap<>();
    headers_map.put("Accept-Language", "ru-UA");
    headers_map.put("NDCDEVICEID", deviceId);
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