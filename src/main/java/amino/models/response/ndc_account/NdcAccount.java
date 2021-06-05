package amino.models.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class NdcAccount {

  @SerializedName("userProfile")
  private UserProfile userProfile;

  public UserProfile getUserProfile() {
    return userProfile;
  }
}