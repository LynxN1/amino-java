package pojo.response.sub_clients;

import com.google.gson.annotations.SerializedName;

public class Member {

  @SerializedName("userProfile")
  private UserProfile userProfile;

  public UserProfile getUserProfile() {
    return userProfile;
  }
}