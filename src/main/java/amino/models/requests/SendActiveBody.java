package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SendActiveBody {
    @SerializedName("userActiveTimeChunkList")
    private List<UserActiveTimeChunkList> userActiveTimeChunkList;

    @SerializedName("optInAdsFlags")
    private long optInAdsFlags = 0;

    @SerializedName("timezone")
    private int timezone;

    @SerializedName("timestamp")
    private long timestamp = TimeUtils.unixInstant();

    public void setOptInAdsFlags(long optInAdsFlags) {
        this.optInAdsFlags = optInAdsFlags;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public List<UserActiveTimeChunkList> getUserActiveTimeChunkList() {
        return userActiveTimeChunkList;
    }

    public void setUserActiveTimeChunkList(List<UserActiveTimeChunkList> userActiveTimeChunkList){
        this.userActiveTimeChunkList = userActiveTimeChunkList;
    }
}
