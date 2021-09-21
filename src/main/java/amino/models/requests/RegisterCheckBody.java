package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class RegisterCheckBody {
    @SerializedName("deviceID")
    private String deviceId;
    @SerializedName("email")
    private String email;
    @SerializedName("timestamp")
    private long timestamp = TimeUtils.unixInstant();

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
}
