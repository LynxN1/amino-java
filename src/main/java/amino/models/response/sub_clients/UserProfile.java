package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;

public class UserProfile {
    @SerializedName(value="followingStatus")
    private int followingStatus;
    @SerializedName(value="membersCount")
    private int membersCount;
    @SerializedName(value="role")
    private int role;
    @SerializedName(value="level")
    private int level;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="reputation")
    private int reputation;
    @SerializedName(value="membershipStatus")
    private int membershipStatus;
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="accountMembershipStatus")
    private int accountMembershipStatus;
    @SerializedName(value="ndcId")
    private int ndcId;
    @SerializedName(value="isGlobal")
    private boolean isGlobal;
    @SerializedName(value="nickname")
    private String nickname;
    @SerializedName(value="isNicknameVerified")
    private boolean isNicknameVerified;
    @SerializedName(value="status")
    private int status;
    @SerializedName(value="avatarFrameId")
    private String avatarFrameId;

    public int getFollowingStatus() {
        return this.followingStatus;
    }

    public int getMembersCount() {
        return this.membersCount;
    }

    public int getRole() {
        return this.role;
    }

    public int getLevel() {
        return this.level;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getReputation() {
        return this.reputation;
    }

    public int getMembershipStatus() {
        return this.membershipStatus;
    }

    public String getUid() {
        return this.uid;
    }

    public int getAccountMembershipStatus() {
        return this.accountMembershipStatus;
    }

    public int getNdcId() {
        return this.ndcId;
    }

    public boolean isIsGlobal() {
        return this.isGlobal;
    }

    public String getNickname() {
        return this.nickname;
    }

    public boolean isIsNicknameVerified() {
        return this.isNicknameVerified;
    }

    public int getStatus() {
        return this.status;
    }

    public String getAvatarFrameId() {
        return this.avatarFrameId;
    }
}

