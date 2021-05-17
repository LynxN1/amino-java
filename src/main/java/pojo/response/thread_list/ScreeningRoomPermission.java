package pojo.response.thread_list;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ScreeningRoomPermission {

  @SerializedName("uidList")
  private List<Object> uidList;

  @SerializedName("action")
  private int action;

  public List<Object> getUidList() {
    return uidList;
  }

  public int getAction() {
    return action;
  }
}