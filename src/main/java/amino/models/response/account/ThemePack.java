package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class ThemePack {
    @SerializedName(value="themeColor")
    private String themeColor;
    @SerializedName(value="themePackUrl")
    private String themePackUrl;
    @SerializedName(value="themePackHash")
    private String themePackHash;
    @SerializedName(value="themePackRevision")
    private int themePackRevision;

    public String getThemeColor() {
        return this.themeColor;
    }

    public String getThemePackUrl() {
        return this.themePackUrl;
    }

    public String getThemePackHash() {
        return this.themePackHash;
    }

    public int getThemePackRevision() {
        return this.themePackRevision;
    }
}

