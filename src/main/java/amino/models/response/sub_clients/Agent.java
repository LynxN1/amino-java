package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;

public class Agent {

  @SerializedName("followingStatus")
  private int followingStatus;

  @SerializedName("membersCount")
  private int membersCount;

  @SerializedName("role")
  private Object role;

  @SerializedName("level")
  private int level;

  @SerializedName("icon")
  private Object icon;

  @SerializedName("reputation")
  private int reputation;

  @SerializedName("membershipStatus")
  private int membershipStatus;

  @SerializedName("uid")
  private String uid;

  @SerializedName("accountMembershipStatus")
  private int accountMembershipStatus;

  @SerializedName("ndcId")
  private Object ndcId;

  @SerializedName("isGlobal")
  private boolean isGlobal;

  @SerializedName("nickname")
  private Object nickname;

  @SerializedName("isNicknameVerified")
  private boolean isNicknameVerified;

  @SerializedName("status")
  private Object status;

  public int getFollowingStatus() {
    return followingStatus;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public Object getRole() {
    return role;
  }

  public int getLevel() {
    return level;
  }

  public Object getIcon() {
    return icon;
  }

  public int getReputation() {
    return reputation;
  }

  public int getMembershipStatus() {
    return membershipStatus;
  }

  public String getUid() {
    return uid;
  }

  public int getAccountMembershipStatus() {
    return accountMembershipStatus;
  }

  public Object getNdcId() {
    return ndcId;
  }

  public boolean isIsGlobal() {
    return isGlobal;
  }

  public Object getNickname() {
    return nickname;
  }

  public boolean isIsNicknameVerified() {
    return isNicknameVerified;
  }

  public Object getStatus() {
    return status;
  }
}