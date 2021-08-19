package amino.models.response.user_list;

import amino.models.response.account.DeviceInfo;
import amino.models.response.user_list.Style;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Extensions {
    @SerializedName(value="privilegeOfChatInviteRequest")
    private int privilegeOfChatInviteRequest;
    @SerializedName(value="privilegeOfCommentOnUserProfile")
    private int privilegeOfCommentOnUserProfile;
    @SerializedName(value="hideUserProfile")
    private boolean hideUserProfile;
    @SerializedName(value="style")
    private Style style;
    @SerializedName(value="defaultBubbleId")
    private String defaultBubbleId;
    @SerializedName(value="coverAnimation")
    private String coverAnimation;
    @SerializedName(value="customTitles")
    private List<Object> customTitles;
    @SerializedName(value="mediaLabAdsMigrationAugust2020")
    private boolean mediaLabAdsMigrationAugust2020;
    @SerializedName(value="deviceInfo")
    private DeviceInfo deviceInfo;

    public int getPrivilegeOfChatInviteRequest() {
        return this.privilegeOfChatInviteRequest;
    }

    public int getPrivilegeOfCommentOnUserProfile() {
        return this.privilegeOfCommentOnUserProfile;
    }

    public boolean isHideUserProfile() {
        return this.hideUserProfile;
    }

    public Style getStyle() {
        return this.style;
    }

    public String getDefaultBubbleId() {
        return this.defaultBubbleId;
    }

    public String getCoverAnimation() {
        return this.coverAnimation;
    }

    public List<Object> getCustomTitles() {
        return this.customTitles;
    }

    public boolean isMediaLabAdsMigrationAugust2020() {
        return this.mediaLabAdsMigrationAugust2020;
    }

    public DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }
}

