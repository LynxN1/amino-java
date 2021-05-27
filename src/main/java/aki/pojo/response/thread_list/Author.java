package aki.pojo.response.thread_list;

import com.google.gson.annotations.SerializedName;

public class Author {

  @SerializedName("followingStatus")
  private int followingStatus;

  @SerializedName("membersCount")
  private int membersCount;

  @SerializedName("role")
  private int role;

  @SerializedName("level")
  private int level;

  @SerializedName("icon")
  private String icon;

  @SerializedName("reputation")
  private int reputation;

  @SerializedName("membershipStatus")
  private int membershipStatus;

  @SerializedName("uid")
  private String uid;

  @SerializedName("accountMembershipStatus")
  private int accountMembershipStatus;

  @SerializedName("ndcId")
  private int ndcId;

  @SerializedName("isGlobal")
  private boolean isGlobal;

  @SerializedName("avatarFrame")
  private AvatarFrame avatarFrame;

  @SerializedName("nickname")
  private String nickname;

  @SerializedName("isNicknameVerified")
  private boolean isNicknameVerified;

  @SerializedName("avatarFrameId")
  private String avatarFrameId;

  @SerializedName("status")
  private int status;

  public int getFollowingStatus() {
    return followingStatus;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public int getRole() {
    return role;
  }

  public int getLevel() {
    return level;
  }

  public String getIcon() {
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

  public int getNdcId() {
    return ndcId;
  }

  public boolean isIsGlobal() {
    return isGlobal;
  }

  public AvatarFrame getAvatarFrame() {
    return avatarFrame;
  }

  public String getNickname() {
    return nickname;
  }

  public boolean isIsNicknameVerified() {
    return isNicknameVerified;
  }

  public String getAvatarFrameId() {
    return avatarFrameId;
  }

  public int getStatus() {
    return status;
  }
}