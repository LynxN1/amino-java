package amino.models.response.ndc_account;

import com.google.gson.annotations.SerializedName;

import java.util.List;

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
    private Object content;
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
    @SerializedName(value="visitorsCount")
    private int visitorsCount;
    @SerializedName(value="moodSticker")
    private MoodSticker moodSticker;
    @SerializedName(value="settings")
    private Settings settings;
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
    @SerializedName(value="commentsCount")
    private int commentsCount;
    @SerializedName(value="isGlobal")
    private boolean isGlobal;
    @SerializedName(value="isNicknameVerified")
    private boolean isNicknameVerified;
    @SerializedName(value="fanClubList")
    private List<Object> fanClubList;
    @SerializedName(value="joinedCount")
    private int joinedCount;
    @SerializedName(value="visitPrivacy")
    private int visitPrivacy;
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

    public Object getContent() {
        return this.content;
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

    public int getVisitorsCount() {
        return this.visitorsCount;
    }

    public MoodSticker getMoodSticker() {
        return this.moodSticker;
    }

    public Settings getSettings() {
        return this.settings;
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

    public int getCommentsCount() {
        return this.commentsCount;
    }

    public boolean isIsGlobal() {
        return this.isGlobal;
    }

    public boolean isIsNicknameVerified() {
        return this.isNicknameVerified;
    }

    public List<Object> getFanClubList() {
        return this.fanClubList;
    }

    public int getJoinedCount() {
        return this.joinedCount;
    }

    public int getVisitPrivacy() {
        return this.visitPrivacy;
    }

    public String getAvatarFrameId() {
        return this.avatarFrameId;
    }

    public int getStatus() {
        return this.status;
    }
}

