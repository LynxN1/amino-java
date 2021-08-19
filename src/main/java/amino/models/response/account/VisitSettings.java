package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class VisitSettings {
    @SerializedName(value="notificationStatus")
    private int notificationStatus;
    @SerializedName(value="privacyMode")
    private int privacyMode;

    public int getNotificationStatus() {
        return this.notificationStatus;
    }

    public int getPrivacyMode() {
        return this.privacyMode;
    }
}

