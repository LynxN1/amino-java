package pojo.response.thread_list;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ThreadList {

  @SerializedName("api:timestamp")
  private String apiTimestamp;

  @SerializedName("threadList")
  private List<ThreadListItem> threadList;

  @SerializedName("api:duration")
  private String apiDuration;

  @SerializedName("api:statuscode")
  private int apiStatuscode;

  @SerializedName("playlistInThreadList")
  private PlaylistInThreadList playlistInThreadList;

  @SerializedName("api:message")
  private String apiMessage;

  public String getApiTimestamp() {
    return apiTimestamp;
  }

  public List<ThreadListItem> getThreadList() {
    return threadList;
  }

  public String getApiDuration() {
    return apiDuration;
  }

  public int getApiStatuscode() {
    return apiStatuscode;
  }

  public PlaylistInThreadList getPlaylistInThreadList() {
    return playlistInThreadList;
  }

  public String getApiMessage() {
    return apiMessage;
  }
}