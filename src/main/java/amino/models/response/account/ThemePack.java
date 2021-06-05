package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class ThemePack {

  @SerializedName("themeColor")
  private String themeColor;

  @SerializedName("themePackUrl")
  private String themePackUrl;

  @SerializedName("themePackHash")
  private String themePackHash;

  @SerializedName("themePackRevision")
  private int themePackRevision;

  public String getThemeColor() {
    return themeColor;
  }

  public String getThemePackUrl() {
    return themePackUrl;
  }

  public String getThemePackHash() {
    return themePackHash;
  }

  public int getThemePackRevision() {
    return themePackRevision;
  }
}