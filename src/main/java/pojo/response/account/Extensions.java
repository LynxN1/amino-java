package pojo.response.account;

import com.google.gson.annotations.SerializedName;

public class Extensions{

	@SerializedName("privilegeOfChatInviteRequest")
	private int privilegeOfChatInviteRequest;

	@SerializedName("privilegeOfCommentOnUserProfile")
	private int privilegeOfCommentOnUserProfile;

	@SerializedName("visitSettings")
	private VisitSettings visitSettings;

	@SerializedName("mediaLabAdsMigrationJuly2020")
	private boolean mediaLabAdsMigrationJuly2020;

	@SerializedName("contentLanguage")
	private String contentLanguage;

	@SerializedName("adsLevel")
	private int adsLevel;

	@SerializedName("mediaLabAdsMigrationAugust2020")
	private boolean mediaLabAdsMigrationAugust2020;

	@SerializedName("adsFlags")
	private int adsFlags;

	@SerializedName("deviceInfo")
	private DeviceInfo deviceInfo;

	@SerializedName("avatarFrameId")
	private String avatarFrameId;

	@SerializedName("adsEnabled")
	private boolean adsEnabled;

	public int getPrivilegeOfChatInviteRequest(){
		return privilegeOfChatInviteRequest;
	}

	public int getPrivilegeOfCommentOnUserProfile(){
		return privilegeOfCommentOnUserProfile;
	}

	public VisitSettings getVisitSettings(){
		return visitSettings;
	}

	public boolean isMediaLabAdsMigrationJuly2020(){
		return mediaLabAdsMigrationJuly2020;
	}

	public String getContentLanguage(){
		return contentLanguage;
	}

	public int getAdsLevel(){
		return adsLevel;
	}

	public boolean isMediaLabAdsMigrationAugust2020(){
		return mediaLabAdsMigrationAugust2020;
	}

	public int getAdsFlags(){
		return adsFlags;
	}

	public DeviceInfo getDeviceInfo(){
		return deviceInfo;
	}

	public String getAvatarFrameId(){
		return avatarFrameId;
	}

	public boolean isAdsEnabled(){
		return adsEnabled;
	}
}