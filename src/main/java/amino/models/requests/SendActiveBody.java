package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SendActiveBody {
    @SerializedName("userActiveTimeChunkList")
    private List<UserActiveTimeChunkList> userActiveTimeChunkList;

    @SerializedName("optInAdsFlags")
    private long optInAdsFlags = 2147483647;

    @SerializedName("timezone")
    private int timezone = 180;

    @SerializedName("timestamp")
    private long timestamp = TimeUtils.unixInstant();

    public void setUserActiveTimeChunkList(List<UserActiveTimeChunkList> userActiveTimeChunkList){
        this.userActiveTimeChunkList = userActiveTimeChunkList;
    }
}
