package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class Extensions {
    @SerializedName(value="privilegeOfChatInviteRequest")
    private int privilegeOfChatInviteRequest;
    @SerializedName(value="privilegeOfCommentOnUserProfile")
    private int privilegeOfCommentOnUserProfile;
    @SerializedName(value="visitSettings")
    private VisitSettings visitSettings;
    @SerializedName(value="mediaLabAdsMigrationJuly2020")
    private boolean mediaLabAdsMigrationJuly2020;
    @SerializedName(value="contentLanguage")
    private String contentLanguage;
    @SerializedName(value="adsLevel")
    private int adsLevel;
    @SerializedName(value="mediaLabAdsMigrationAugust2020")
    private boolean mediaLabAdsMigrationAugust2020;
    @SerializedName(value="adsFlags")
    private int adsFlags;
    @SerializedName(value="deviceInfo")
    private DeviceInfo deviceInfo;
    @SerializedName(value="avatarFrameId")
    private String avatarFrameId;
    @SerializedName(value="adsEnabled")
    private boolean adsEnabled;

    public int getPrivilegeOfChatInviteRequest() {
        return this.privilegeOfChatInviteRequest;
    }

    public int getPrivilegeOfCommentOnUserProfile() {
        return this.privilegeOfCommentOnUserProfile;
    }

    public VisitSettings getVisitSettings() {
        return this.visitSettings;
    }

    public boolean isMediaLabAdsMigrationJuly2020() {
        return this.mediaLabAdsMigrationJuly2020;
    }

    public String getContentLanguage() {
        return this.contentLanguage;
    }

    public int getAdsLevel() {
        return this.adsLevel;
    }

    public boolean isMediaLabAdsMigrationAugust2020() {
        return this.mediaLabAdsMigrationAugust2020;
    }

    public int getAdsFlags() {
        return this.adsFlags;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public String getAvatarFrameId() {
        return this.avatarFrameId;
    }

    public boolean isAdsEnabled() {
        return this.adsEnabled;
    }
}

