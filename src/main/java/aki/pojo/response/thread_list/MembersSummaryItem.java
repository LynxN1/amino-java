package aki.pojo.response.thread_list;

import com.google.gson.annotations.SerializedName;

public class MembersSummaryItem {

  @SerializedName("uid")
  private String uid;

  @SerializedName("role")
  private int role;

  @SerializedName("nickname")
  private String nickname;

  @SerializedName("icon")
  private String icon;

  @SerializedName("membershipStatus")
  private int membershipStatus;

  @SerializedName("status")
  private int status;

  public String getUid() {
    return uid;
  }

  public int getRole() {
    return role;
  }

  public String getNickname() {
    return nickname;
  }

  public String getIcon() {
    return icon;
  }

  public int getMembershipStatus() {
    return membershipStatus;
  }

  public int getStatus() {
    return status;
  }
}