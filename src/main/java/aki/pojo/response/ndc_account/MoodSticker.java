package aki.pojo.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class MoodSticker {

  @SerializedName("iconV2")
  private String iconV2;

  @SerializedName("stickerCollectionId")
  private Object stickerCollectionId;

  @SerializedName("mediumIconV2")
  private Object mediumIconV2;

  @SerializedName("icon")
  private String icon;

  @SerializedName("stickerId")
  private String stickerId;

  @SerializedName("extensions")
  private Object extensions;

  @SerializedName("smallIconV2")
  private Object smallIconV2;

  @SerializedName("name")
  private Object name;

  @SerializedName("createdTime")
  private Object createdTime;

  @SerializedName("smallIcon")
  private Object smallIcon;

  @SerializedName("mediumIcon")
  private Object mediumIcon;

  @SerializedName("usedCount")
  private int usedCount;

  @SerializedName("status")
  private int status;

  public String getIconV2() {
    return iconV2;
  }

  public Object getStickerCollectionId() {
    return stickerCollectionId;
  }

  public Object getMediumIconV2() {
    return mediumIconV2;
  }

  public String getIcon() {
    return icon;
  }

  public String getStickerId() {
    return stickerId;
  }

  public Object getExtensions() {
    return extensions;
  }

  public Object getSmallIconV2() {
    return smallIconV2;
  }

  public Object getName() {
    return name;
  }

  public Object getCreatedTime() {
    return createdTime;
  }

  public Object getSmallIcon() {
    return smallIcon;
  }

  public Object getMediumIcon() {
    return mediumIcon;
  }

  public int getUsedCount() {
    return usedCount;
  }

  public int getStatus() {
    return status;
  }
}