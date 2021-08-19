package amino.models.response.thread_list;

import com.google.gson.annotations.SerializedName;

public class MembersSummaryItem {
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="role")
    private int role;
    @SerializedName(value="nickname")
    private String nickname;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="membershipStatus")
    private int membershipStatus;
    @SerializedName(value="status")
    private int status;

    public String getUid() {
        return this.uid;
    }

    public int getRole() {
        return this.role;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getMembershipStatus() {
        return this.membershipStatus;
    }

    public int getStatus() {
        return this.status;
    }
}

