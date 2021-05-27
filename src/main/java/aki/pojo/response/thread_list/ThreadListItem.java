package aki.pojo.response.thread_list;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ThreadListItem {

  @SerializedName("modifiedTime")
  private Object modifiedTime;

  @SerializedName("membersQuota")
  private int membersQuota;

  @SerializedName("keywords")
  private Object keywords;

  @SerializedName("needHidden")
  private boolean needHidden;

  @SerializedName("lastReadTime")
  private String lastReadTime;

  @SerializedName("icon")
  private String icon;

  @SerializedName("title")
  private String title;

  @SerializedName("type")
  private int type;

  @SerializedName("content")
  private String content;

  @SerializedName("threadId")
  private String threadId;

  @SerializedName("latestActivityTime")
  private String latestActivityTime;

  @SerializedName("uid")
  private String uid;

  @SerializedName("ndcId")
  private int ndcId;

  @SerializedName("createdTime")
  private Object createdTime;

  @SerializedName("alertOption")
  private int alertOption;

  @SerializedName("membersCount")
  private int membersCount;

  @SerializedName("membersSummary")
  private List<MembersSummaryItem> membersSummary;

  @SerializedName("isPinned")
  private boolean isPinned;

  @SerializedName("author")
  private Author author;

  @SerializedName("userAddedTopicList")
  private List<Object> userAddedTopicList;

  @SerializedName("lastMessageSummary")
  private LastMessageSummary lastMessageSummary;

  @SerializedName("membershipStatus")
  private int membershipStatus;

  @SerializedName("condition")
  private int condition;

  @SerializedName("extensions")
  private Extensions extensions;

  @SerializedName("strategyInfo")
  private String strategyInfo;

  @SerializedName("status")
  private int status;

  @SerializedName("publishToGlobal")
  private int publishToGlobal;

  public Object getModifiedTime() {
    return modifiedTime;
  }

  public int getMembersQuota() {
    return membersQuota;
  }

  public Object getKeywords() {
    return keywords;
  }

  public boolean isNeedHidden() {
    return needHidden;
  }

  public String getLastReadTime() {
    return lastReadTime;
  }

  public String getIcon() {
    return icon;
  }

  public String getTitle() {
    return title;
  }

  public int getType() {
    return type;
  }

  public String getContent() {
    return content;
  }

  public String getThreadId() {
    return threadId;
  }

  public String getLatestActivityTime() {
    return latestActivityTime;
  }

  public String getUid() {
    return uid;
  }

  public int getNdcId() {
    return ndcId;
  }

  public Object getCreatedTime() {
    return createdTime;
  }

  public int getAlertOption() {
    return alertOption;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public List<MembersSummaryItem> getMembersSummary() {
    return membersSummary;
  }

  public boolean isIsPinned() {
    return isPinned;
  }

  public Author getAuthor() {
    return author;
  }

  public List<Object> getUserAddedTopicList() {
    return userAddedTopicList;
  }

  public LastMessageSummary getLastMessageSummary() {
    return lastMessageSummary;
  }

  public int getMembershipStatus() {
    return membershipStatus;
  }

  public int getCondition() {
    return condition;
  }

  public Extensions getExtensions() {
    return extensions;
  }

  public String getStrategyInfo() {
    return strategyInfo;
  }

  public int getStatus() {
    return status;
  }

  public int getPublishToGlobal() {
    return publishToGlobal;
  }
}