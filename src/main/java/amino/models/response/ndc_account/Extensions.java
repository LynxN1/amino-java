package amino.models.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class Extensions {
    @SerializedName(value="privilegeOfChatInviteRequest")
    private int privilegeOfChatInviteRequest;
    @SerializedName(value="privilegeOfCommentOnUserProfile")
    private int privilegeOfCommentOnUserProfile;
    @SerializedName(value="style")
    private Style style;
    @SerializedName(value="defaultBubbleId")
    private String defaultBubbleId;

    public int getPrivilegeOfChatInviteRequest() {
        return this.privilegeOfChatInviteRequest;
    }

    public int getPrivilegeOfCommentOnUserProfile() {
        return this.privilegeOfCommentOnUserProfile;
    }

    public Style getStyle() {
        return this.style;
    }

    public String getDefaultBubbleId() {
        return this.defaultBubbleId;
    }
}

