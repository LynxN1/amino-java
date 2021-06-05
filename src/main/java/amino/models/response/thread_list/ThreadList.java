package amino.models.response.thread_list;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ThreadList {

  @SerializedName("threadList")
  private List<ThreadListItem> threadList;

  @SerializedName("playlistInThreadList")
  private PlaylistInThreadList playlistInThreadList;

  public List<ThreadListItem> getThreadList() {
    return threadList;
  }

  public PlaylistInThreadList getPlaylistInThreadList() {
    return playlistInThreadList;
  }
}