package amino.models.requests;

import amino.utils.TimeUtils;

public class LoginBody {
    private String email;
    private int v;
    private String secret;
    private String deviceID;
    private int clientType;
    private String action;
    private Long timestamp = TimeUtils.unixInstant();

    public LoginBody email(String email) {
        this.email = email;
        return this;
    }

    public LoginBody v(int v) {
        this.v = v;
        return this;
    }

    public LoginBody secret(String secret) {
        this.secret = "0 " + secret;
        return this;
    }

    public LoginBody deviceId(String deviceId) {
        this.deviceID = deviceId;
        return this;
    }

    public LoginBody clientType(int clientType) {
        this.clientType = clientType;
        return this;
    }

    public LoginBody action(String action) {
        this.action = action;
        return this;
    }
}

