package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class DeviceInfo {
    @SerializedName(value="lastClientType")
    private int lastClientType;

    public int getLastClientType() {
        return this.lastClientType;
    }
}

