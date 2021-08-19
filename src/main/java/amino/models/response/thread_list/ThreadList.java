package amino.models.response.thread_list;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ThreadList {
    @SerializedName(value="threadList")
    private List<ThreadListItem> threadList;
    @SerializedName(value="playlistInThreadList")
    private PlaylistInThreadList playlistInThreadList;

    public List<ThreadListItem> getThreadList() {
        return this.threadList;
    }

    public PlaylistInThreadList getPlaylistInThreadList() {
        return this.playlistInThreadList;
    }
}

