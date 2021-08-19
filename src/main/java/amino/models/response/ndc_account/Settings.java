package amino.models.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class Settings {
    @SerializedName(value="onlineStatus")
    private int onlineStatus;

    public int getOnlineStatus() {
        return this.onlineStatus;
    }
}

