package pojo.response.account;

import com.google.gson.annotations.SerializedName;

public class AdvancedSettings {

  @SerializedName("analyticsEnabled")
  private int analyticsEnabled;

  public int getAnalyticsEnabled() {
    return analyticsEnabled;
  }
}