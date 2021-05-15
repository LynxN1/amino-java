package pojo.response.account;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class UserProfile{

	@SerializedName("modifiedTime")
	private String modifiedTime;

	@SerializedName("role")
	private int role;

	@SerializedName("mood")
	private Object mood;

	@SerializedName("onlineStatus")
	private int onlineStatus;

	@SerializedName("icon")
	private String icon;

	@SerializedName("reputation")
	private int reputation;

	@SerializedName("itemsCount")
	private int itemsCount;

	@SerializedName("content")
	private String content;

	@SerializedName("aminoId")
	private String aminoId;

	@SerializedName("uid")
	private String uid;

	@SerializedName("accountMembershipStatus")
	private int accountMembershipStatus;

	@SerializedName("postsCount")
	private int postsCount;

	@SerializedName("ndcId")
	private int ndcId;

	@SerializedName("avatarFrame")
	private AvatarFrame avatarFrame;

	@SerializedName("nickname")
	private String nickname;

	@SerializedName("pushEnabled")
	private boolean pushEnabled;

	@SerializedName("createdTime")
	private String createdTime;

	@SerializedName("consecutiveCheckInDays")
	private Object consecutiveCheckInDays;

	@SerializedName("blogsCount")
	private int blogsCount;

	@SerializedName("followingStatus")
	private int followingStatus;

	@SerializedName("moodSticker")
	private Object moodSticker;

	@SerializedName("membersCount")
	private int membersCount;

	@SerializedName("level")
	private int level;

	@SerializedName("membershipStatus")
	private int membershipStatus;

	@SerializedName("storiesCount")
	private int storiesCount;

	@SerializedName("notificationSubscriptionStatus")
	private int notificationSubscriptionStatus;

	@SerializedName("extensions")
	private Extensions extensions;

	@SerializedName("mediaList")
	private Object mediaList;

	@SerializedName("commentsCount")
	private int commentsCount;

	@SerializedName("isGlobal")
	private boolean isGlobal;

	@SerializedName("isNicknameVerified")
	private boolean isNicknameVerified;

	@SerializedName("joinedCount")
	private int joinedCount;

	@SerializedName("avatarFrameId")
	private String avatarFrameId;

	@SerializedName("status")
	private int status;

	public String getModifiedTime(){
		return modifiedTime;
	}

	public int getRole(){
		return role;
	}

	public Object getMood(){
		return mood;
	}

	public int getOnlineStatus(){
		return onlineStatus;
	}

	public String getIcon(){
		return icon;
	}

	public int getReputation(){
		return reputation;
	}

	public int getItemsCount(){
		return itemsCount;
	}

	public String getContent(){
		return content;
	}

	public String getAminoId(){
		return aminoId;
	}

	public String getUid(){
		return uid;
	}

	public int getAccountMembershipStatus(){
		return accountMembershipStatus;
	}

	public int getPostsCount(){
		return postsCount;
	}

	public int getNdcId(){
		return ndcId;
	}

	public AvatarFrame getAvatarFrame(){
		return avatarFrame;
	}

	public String getNickname(){
		return nickname;
	}

	public boolean isPushEnabled(){
		return pushEnabled;
	}

	public String getCreatedTime(){
		return createdTime;
	}

	public Object getConsecutiveCheckInDays(){
		return consecutiveCheckInDays;
	}

	public int getBlogsCount(){
		return blogsCount;
	}

	public int getFollowingStatus(){
		return followingStatus;
	}

	public Object getMoodSticker(){
		return moodSticker;
	}

	public int getMembersCount(){
		return membersCount;
	}

	public int getLevel(){
		return level;
	}

	public int getMembershipStatus(){
		return membershipStatus;
	}

	public int getStoriesCount(){
		return storiesCount;
	}

	public int getNotificationSubscriptionStatus(){
		return notificationSubscriptionStatus;
	}

	public Extensions getExtensions(){
		return extensions;
	}

	public Object getMediaList(){
		return mediaList;
	}

	public int getCommentsCount(){
		return commentsCount;
	}

	public boolean isIsGlobal(){
		return isGlobal;
	}

	public boolean isIsNicknameVerified(){
		return isNicknameVerified;
	}

	public int getJoinedCount(){
		return joinedCount;
	}

	public String getAvatarFrameId(){
		return avatarFrameId;
	}

	public int getStatus(){
		return status;
	}
}