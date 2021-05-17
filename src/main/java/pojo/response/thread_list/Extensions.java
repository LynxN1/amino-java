package pojo.response.thread_list;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Extensions {

  @SerializedName("lastMembersSummaryUpdateTime")
  private int lastMembersSummaryUpdateTime;

  @SerializedName("coHost")
  private List<String> coHost;

  @SerializedName("language")
  private String language;

  @SerializedName("pinAnnouncement")
  private boolean pinAnnouncement;

  @SerializedName("bm")
  private List<JsonElement> bm;

  @SerializedName("announcement")
  private String announcement;

  @SerializedName("membersCanInvite")
  private boolean membersCanInvite;

  @SerializedName("fansOnly")
  private boolean fansOnly;

  @SerializedName("visibility")
  private int visibility;

  @SerializedName("channelType")
  private int channelType;

  @SerializedName("avchatMemberUidList")
  private List<String> avchatMemberUidList;

  @SerializedName("creatorUid")
  private String creatorUid;

  @SerializedName("bannedMemberUidList")
  private List<String> bannedMemberUidList;

  @SerializedName("viewOnly")
  private boolean viewOnly;

  @SerializedName("vvChatJoinType")
  private int vvChatJoinType;

  @SerializedName("screeningRoomPermission")
  private ScreeningRoomPermission screeningRoomPermission;

  public int getLastMembersSummaryUpdateTime() {
    return lastMembersSummaryUpdateTime;
  }

  public List<String> getCoHost() {
    return coHost;
  }

  public String getLanguage() {
    return language;
  }

  public boolean isPinAnnouncement() {
    return pinAnnouncement;
  }

  public List<JsonElement> getBm() {
    return bm;
  }

  public String getAnnouncement() {
    return announcement;
  }

  public boolean isMembersCanInvite() {
    return membersCanInvite;
  }

  public boolean isFansOnly() {
    return fansOnly;
  }

  public int getVisibility() {
    return visibility;
  }

  public int getChannelType() {
    return channelType;
  }

  public List<String> getAvchatMemberUidList() {
    return avchatMemberUidList;
  }

  public String getCreatorUid() {
    return creatorUid;
  }

  public List<String> getBannedMemberUidList() {
    return bannedMemberUidList;
  }

  public boolean isViewOnly() {
    return viewOnly;
  }

  public int getVvChatJoinType() {
    return vvChatJoinType;
  }

  public ScreeningRoomPermission getScreeningRoomPermission() {
    return screeningRoomPermission;
  }
}