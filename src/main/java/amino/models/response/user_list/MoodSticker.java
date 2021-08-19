package amino.models.response.user_list;

import com.google.gson.annotations.SerializedName;

public class MoodSticker {
    @SerializedName(value="iconV2")
    private String iconV2;
    @SerializedName(value="stickerCollectionId")
    private String stickerCollectionId;
    @SerializedName(value="mediumIconV2")
    private String mediumIconV2;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="stickerId")
    private String stickerId;
    @SerializedName(value="extensions")
    private Object extensions;
    @SerializedName(value="smallIconV2")
    private String smallIconV2;
    @SerializedName(value="name")
    private Object name;
    @SerializedName(value="createdTime")
    private Object createdTime;
    @SerializedName(value="smallIcon")
    private String smallIcon;
    @SerializedName(value="mediumIcon")
    private String mediumIcon;
    @SerializedName(value="usedCount")
    private int usedCount;
    @SerializedName(value="status")
    private int status;

    public String getIconV2() {
        return this.iconV2;
    }

    public String getStickerCollectionId() {
        return this.stickerCollectionId;
    }

    public String getMediumIconV2() {
        return this.mediumIconV2;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public Object getExtensions() {
        return this.extensions;
    }

    public String getSmallIconV2() {
        return this.smallIconV2;
    }

    public Object getName() {
        return this.name;
    }

    public Object getCreatedTime() {
        return this.createdTime;
    }

    public String getSmallIcon() {
        return this.smallIcon;
    }

    public String getMediumIcon() {
        return this.mediumIcon;
    }

    public int getUsedCount() {
        return this.usedCount;
    }

    public int getStatus() {
        return this.status;
    }
}

