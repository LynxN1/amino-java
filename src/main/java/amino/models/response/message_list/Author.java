package amino.models.response.message_list;

import com.google.gson.annotations.SerializedName;

public class Author {
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="accountMembershipStatus")
    private int accountMembershipStatus;
    @SerializedName(value="role")
    private int role;
    @SerializedName(value="level")
    private int level;
    @SerializedName(value="nickname")
    private String nickname;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="reputation")
    private int reputation;
    @SerializedName(value="status")
    private int status;
    @SerializedName(value="isNicknameVerified")
    private boolean isNicknameVerified;
    @SerializedName(value="membershipStatus")
    private int membershipStatus;

    public String getUid() {
        return this.uid;
    }

    public int getAccountMembershipStatus() {
        return this.accountMembershipStatus;
    }

    public int getRole() {
        return this.role;
    }

    public int getLevel() {
        return this.level;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getReputation() {
        return this.reputation;
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isIsNicknameVerified() {
        return this.isNicknameVerified;
    }

    public int getMembershipStatus() {
        return this.membershipStatus;
    }
}

