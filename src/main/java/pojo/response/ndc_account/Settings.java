package pojo.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class Settings {

  @SerializedName("onlineStatus")
  private int onlineStatus;

  public int getOnlineStatus() {
    return onlineStatus;
  }
}