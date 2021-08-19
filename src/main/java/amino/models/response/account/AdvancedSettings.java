package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class AdvancedSettings {
    @SerializedName(value="analyticsEnabled")
    private int analyticsEnabled;

    public int getAnalyticsEnabled() {
        return this.analyticsEnabled;
    }
}

