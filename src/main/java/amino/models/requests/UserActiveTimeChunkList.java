package amino.models.requests;

import com.google.gson.annotations.SerializedName;

public class UserActiveTimeChunkList {

    @SerializedName("start")
    private long start;

    @SerializedName("end")
    private long end;

    public void setStart(long start) {
        this.start = start;
    }

    public void setEnd(long end) {
        this.end = end;
    }
}
