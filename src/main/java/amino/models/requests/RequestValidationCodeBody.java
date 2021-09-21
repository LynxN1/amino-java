package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class RequestValidationCodeBody {
    @SerializedName("type")
    private int type = 1;
    @SerializedName("identity")
    private String email;
    @SerializedName("deviceID")
    private String deviceID;
    @SerializedName("timestamp")
    private long timestamp = TimeUtils.unixInstant();

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeviceId(String deviceID) {
        this.deviceID = deviceID;
    }
}
