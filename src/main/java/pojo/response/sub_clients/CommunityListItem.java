package pojo.response.sub_clients;

import com.google.gson.annotations.SerializedName;

public class CommunityListItem {

  @SerializedName("modifiedTime")
  private String modifiedTime;

  @SerializedName("agent")
  private Agent agent;

  @SerializedName("membersCount")
  private int membersCount;

  @SerializedName("probationStatus")
  private int probationStatus;

  @SerializedName("promotionalMediaList")
  private Object promotionalMediaList;

  @SerializedName("themePack")
  private ThemePack themePack;

  @SerializedName("userAddedTopicList")
  private Object userAddedTopicList;

  @SerializedName("link")
  private String link;

  @SerializedName("icon")
  private String icon;

  @SerializedName("templateId")
  private int templateId;

  @SerializedName("launchPage")
  private LaunchPage launchPage;

  @SerializedName("communityHeat")
  private float communityHeat;

  @SerializedName("endpoint")
  private String endpoint;

  @SerializedName("ndcId")
  private int ndcId;

  @SerializedName("joinType")
  private int joinType;

  @SerializedName("listedStatus")
  private int listedStatus;

  @SerializedName("name")
  private String name;

  @SerializedName("tagline")
  private String tagline;

  @SerializedName("createdTime")
  private String createdTime;

  @SerializedName("activeInfo")
  private ActiveInfo activeInfo;

  @SerializedName("strategyInfo")
  private String strategyInfo;

  @SerializedName("primaryLanguage")
  private String primaryLanguage;

  @SerializedName("status")
  private int status;

  public String getModifiedTime() {
    return modifiedTime;
  }

  public Agent getAgent() {
    return agent;
  }

  public int getMembersCount() {
    return membersCount;
  }

  public int getProbationStatus() {
    return probationStatus;
  }

  public Object getPromotionalMediaList() {
    return promotionalMediaList;
  }

  public ThemePack getThemePack() {
    return themePack;
  }

  public Object getUserAddedTopicList() {
    return userAddedTopicList;
  }

  public String getLink() {
    return link;
  }

  public String getIcon() {
    return icon;
  }

  public int getTemplateId() {
    return templateId;
  }

  public LaunchPage getLaunchPage() {
    return launchPage;
  }

  public float getCommunityHeat() {
    return communityHeat;
  }

  public String getEndpoint() {
    return endpoint;
  }

  public int getNdcId() {
    return ndcId;
  }

  public int getJoinType() {
    return joinType;
  }

  public int getListedStatus() {
    return listedStatus;
  }

  public String getName() {
    return name;
  }

  public String getTagline() {
    return tagline;
  }

  public String getCreatedTime() {
    return createdTime;
  }

  public ActiveInfo getActiveInfo() {
    return activeInfo;
  }

  public String getStrategyInfo() {
    return strategyInfo;
  }

  public String getPrimaryLanguage() {
    return primaryLanguage;
  }

  public int getStatus() {
    return status;
  }
}