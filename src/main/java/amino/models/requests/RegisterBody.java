package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class RegisterBody {
    @SerializedName("secret")
    private String secret;
    @SerializedName("deviceID")
    private String deviceID;
    @SerializedName("email")
    private String email;
    @SerializedName("clientType")
    private int clientType = 100;
    @SerializedName("nickname")
    private String nickname;
    @SerializedName("latitude")
    private int latitude = 0;
    @SerializedName("longitude")
    private int longitude = 0;
    @SerializedName("address")
    private String address = null;
    @SerializedName("clientCallbackURL")
    private String clientCallbackURL = "narviiapp://relogin";
    @SerializedName("validationContext")
    private ValidationContext validationContext;
    @SerializedName("timestamp")
    private long timestamp = TimeUtils.unixInstant();

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.secret = "0 " + password;
    }

    public void setDeviceId(String deviceID) {
        this.deviceID = deviceID;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setValidationContext(ValidationContext validationContext) {
        this.validationContext = validationContext;
    }
}
