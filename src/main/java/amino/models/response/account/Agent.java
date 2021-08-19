package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class Agent {
    @SerializedName(value="followingStatus")
    private int followingStatus;
    @SerializedName(value="membersCount")
    private int membersCount;
    @SerializedName(value="role")
    private Object role;
    @SerializedName(value="level")
    private int level;
    @SerializedName(value="icon")
    private Object icon;
    @SerializedName(value="reputation")
    private int reputation;
    @SerializedName(value="membershipStatus")
    private int membershipStatus;
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="accountMembershipStatus")
    private int accountMembershipStatus;
    @SerializedName(value="ndcId")
    private Object ndcId;
    @SerializedName(value="isGlobal")
    private boolean isGlobal;
    @SerializedName(value="nickname")
    private Object nickname;
    @SerializedName(value="isNicknameVerified")
    private boolean isNicknameVerified;
    @SerializedName(value="status")
    private Object status;

    public int getFollowingStatus() {
        return this.followingStatus;
    }

    public int getMembersCount() {
        return this.membersCount;
    }

    public Object getRole() {
        return this.role;
    }

    public int getLevel() {
        return this.level;
    }

    public Object getIcon() {
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

    public Object getNdcId() {
        return this.ndcId;
    }

    public boolean isIsGlobal() {
        return this.isGlobal;
    }

    public Object getNickname() {
        return this.nickname;
    }

    public boolean isIsNicknameVerified() {
        return this.isNicknameVerified;
    }

    public Object getStatus() {
        return this.status;
    }
}

