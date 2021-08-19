package amino.models.response.account;

import amino.models.response.account.AvatarFrame;
import amino.models.response.account.Extensions;
import com.google.gson.annotations.SerializedName;

public class UserProfile {
    @SerializedName(value="modifiedTime")
    private String modifiedTime;
    @SerializedName(value="role")
    private int role;
    @SerializedName(value="mood")
    private Object mood;
    @SerializedName(value="onlineStatus")
    private int onlineStatus;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="reputation")
    private int reputation;
    @SerializedName(value="itemsCount")
    private int itemsCount;
    @SerializedName(value="content")
    private String content;
    @SerializedName(value="aminoId")
    private String aminoId;
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="accountMembershipStatus")
    private int accountMembershipStatus;
    @SerializedName(value="postsCount")
    private int postsCount;
    @SerializedName(value="ndcId")
    private int ndcId;
    @SerializedName(value="avatarFrame")
    private AvatarFrame avatarFrame;
    @SerializedName(value="nickname")
    private String nickname;
    @SerializedName(value="pushEnabled")
    private boolean pushEnabled;
    @SerializedName(value="createdTime")
    private String createdTime;
    @SerializedName(value="consecutiveCheckInDays")
    private Object consecutiveCheckInDays;
    @SerializedName(value="blogsCount")
    private int blogsCount;
    @SerializedName(value="followingStatus")
    private int followingStatus;
    @SerializedName(value="moodSticker")
    private Object moodSticker;
    @SerializedName(value="membersCount")
    private int membersCount;
    @SerializedName(value="level")
    private int level;
    @SerializedName(value="membershipStatus")
    private int membershipStatus;
    @SerializedName(value="storiesCount")
    private int storiesCount;
    @SerializedName(value="notificationSubscriptionStatus")
    private int notificationSubscriptionStatus;
    @SerializedName(value="extensions")
    private Extensions extensions;
    @SerializedName(value="mediaList")
    private Object mediaList;
    @SerializedName(value="commentsCount")
    private int commentsCount;
    @SerializedName(value="isGlobal")
    private boolean isGlobal;
    @SerializedName(value="isNicknameVerified")
    private boolean isNicknameVerified;
    @SerializedName(value="joinedCount")
    private int joinedCount;
    @SerializedName(value="avatarFrameId")
    private String avatarFrameId;
    @SerializedName(value="status")
    private int status;

    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public int getRole() {
        return this.role;
    }

    public Object getMood() {
        return this.mood;
    }

    public int getOnlineStatus() {
        return this.onlineStatus;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getReputation() {
        return this.reputation;
    }

    public int getItemsCount() {
        return this.itemsCount;
    }

    public String getContent() {
        return this.content;
    }

    public String getAminoId() {
        return this.aminoId;
    }

    public String getUid() {
        return this.uid;
    }

    public int getAccountMembershipStatus() {
        return this.accountMembershipStatus;
    }

    public int getPostsCount() {
        return this.postsCount;
    }

    public int getNdcId() {
        return this.ndcId;
    }

    public AvatarFrame getAvatarFrame() {
        return this.avatarFrame;
    }

    public String getNickname() {
        return this.nickname;
    }

    public boolean isPushEnabled() {
        return this.pushEnabled;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public Object getConsecutiveCheckInDays() {
        return this.consecutiveCheckInDays;
    }

    public int getBlogsCount() {
        return this.blogsCount;
    }

    public int getFollowingStatus() {
        return this.followingStatus;
    }

    public Object getMoodSticker() {
        return this.moodSticker;
    }

    public int getMembersCount() {
        return this.membersCount;
    }

    public int getLevel() {
        return this.level;
    }

    public int getMembershipStatus() {
        return this.membershipStatus;
    }

    public int getStoriesCount() {
        return this.storiesCount;
    }

    public int getNotificationSubscriptionStatus() {
        return this.notificationSubscriptionStatus;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public Object getMediaList() {
        return this.mediaList;
    }

    public int getCommentsCount() {
        return this.commentsCount;
    }

    public boolean isIsGlobal() {
        return this.isGlobal;
    }

    public boolean isIsNicknameVerified() {
        return this.isNicknameVerified;
    }

    public int getJoinedCount() {
        return this.joinedCount;
    }

    public String getAvatarFrameId() {
        return this.avatarFrameId;
    }

    public int getStatus() {
        return this.status;
    }
}

