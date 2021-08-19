package amino.models.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class MoodSticker {
    @SerializedName(value="iconV2")
    private String iconV2;
    @SerializedName(value="stickerCollectionId")
    private Object stickerCollectionId;
    @SerializedName(value="mediumIconV2")
    private Object mediumIconV2;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="stickerId")
    private String stickerId;
    @SerializedName(value="extensions")
    private Object extensions;
    @SerializedName(value="smallIconV2")
    private Object smallIconV2;
    @SerializedName(value="name")
    private Object name;
    @SerializedName(value="createdTime")
    private Object createdTime;
    @SerializedName(value="smallIcon")
    private Object smallIcon;
    @SerializedName(value="mediumIcon")
    private Object mediumIcon;
    @SerializedName(value="usedCount")
    private int usedCount;
    @SerializedName(value="status")
    private int status;

    public String getIconV2() {
        return this.iconV2;
    }

    public Object getStickerCollectionId() {
        return this.stickerCollectionId;
    }

    public Object getMediumIconV2() {
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

    public Object getSmallIconV2() {
        return this.smallIconV2;
    }

    public Object getName() {
        return this.name;
    }

    public Object getCreatedTime() {
        return this.createdTime;
    }

    public Object getSmallIcon() {
        return this.smallIcon;
    }

    public Object getMediumIcon() {
        return this.mediumIcon;
    }

    public int getUsedCount() {
        return this.usedCount;
    }

    public int getStatus() {
        return this.status;
    }
}

