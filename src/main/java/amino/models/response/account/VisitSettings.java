package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class VisitSettings {

  @SerializedName("notificationStatus")
  private int notificationStatus;

  @SerializedName("privacyMode")
  private int privacyMode;

  public int getNotificationStatus() {
    return notificationStatus;
  }

  public int getPrivacyMode() {
    return privacyMode;
  }
}