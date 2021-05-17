package pojo.response.account;

import com.google.gson.annotations.SerializedName;

public class AccountData {

  @SerializedName("api:timestamp")
  private String apiTimestamp;

  @SerializedName("auid")
  private String auid;

  @SerializedName("api:duration")
  private String apiDuration;

  @SerializedName("api:statuscode")
  private int apiStatuscode;

  @SerializedName("secret")
  private String secret;

  @SerializedName("account")
  private Account account;

  @SerializedName("api:message")
  private String apiMessage;

  @SerializedName("userProfile")
  private UserProfile userProfile;

  @SerializedName("sid")
  private String sid;

  public String getApiTimestamp() {
    return apiTimestamp;
  }

  public String getAuid() {
    return auid;
  }

  public String getApiDuration() {
    return apiDuration;
  }

  public int getApiStatuscode() {
    return apiStatuscode;
  }

  public String getSecret() {
    return secret;
  }

  public Account getAccount() {
    return account;
  }

  public String getApiMessage() {
    return apiMessage;
  }

  public UserProfile getUserProfile() {
    return userProfile;
  }

  public String getSid() {
    return sid;
  }
}