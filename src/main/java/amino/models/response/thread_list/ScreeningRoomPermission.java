package amino.models.response.thread_list;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ScreeningRoomPermission {
    @SerializedName(value="uidList")
    private List<Object> uidList;
    @SerializedName(value="action")
    private int action;

    public List<Object> getUidList() {
        return this.uidList;
    }

    public int getAction() {
        return this.action;
    }
}

