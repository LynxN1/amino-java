package aki.pojo.response.account;

import com.google.gson.annotations.SerializedName;

public class AccountData {

  @SerializedName("auid")
  private String auid;

  @SerializedName("secret")
  private String secret;

  @SerializedName("account")
  private Account account;

  @SerializedName("userProfile")
  private UserProfile userProfile;

  @SerializedName("sid")
  private String sid;

  public String getAuid() {
    return auid;
  }

  public String getSecret() {
    return secret;
  }

  public Account getAccount() {
    return account;
  }

  public UserProfile getUserProfile() {
    return userProfile;
  }

  public String getSid() {
    return sid;
  }
}