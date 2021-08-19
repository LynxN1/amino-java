package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class AccountData {
    @SerializedName(value="auid")
    private String auid;
    @SerializedName(value="secret")
    private String secret;
    @SerializedName(value="account")
    private Account account;
    @SerializedName(value="userProfile")
    private UserProfile userProfile;
    @SerializedName(value="sid")
    private String sid;

    public String getAuid() {
        return this.auid;
    }

    public String getSecret() {
        return this.secret;
    }

    public Account getAccount() {
        return this.account;
    }

    public UserProfile getUserProfile() {
        return this.userProfile;
    }

    public String getSid() {
        return this.sid;
    }
}

