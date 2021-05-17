package pojo.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class Extensions{

	@SerializedName("privilegeOfChatInviteRequest")
	private int privilegeOfChatInviteRequest;

	@SerializedName("privilegeOfCommentOnUserProfile")
	private int privilegeOfCommentOnUserProfile;

	@SerializedName("style")
	private Style style;

	@SerializedName("defaultBubbleId")
	private String defaultBubbleId;

	public int getPrivilegeOfChatInviteRequest(){
		return privilegeOfChatInviteRequest;
	}

	public int getPrivilegeOfCommentOnUserProfile(){
		return privilegeOfCommentOnUserProfile;
	}

	public Style getStyle(){
		return style;
	}

	public String getDefaultBubbleId(){
		return defaultBubbleId;
	}
}