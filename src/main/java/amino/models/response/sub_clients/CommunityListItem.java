package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;

public class CommunityListItem {
    @SerializedName(value="modifiedTime")
    private String modifiedTime;
    @SerializedName(value="agent")
    private Agent agent;
    @SerializedName(value="membersCount")
    private int membersCount;
    @SerializedName(value="probationStatus")
    private int probationStatus;
    @SerializedName(value="promotionalMediaList")
    private Object promotionalMediaList;
    @SerializedName(value="themePack")
    private ThemePack themePack;
    @SerializedName(value="userAddedTopicList")
    private Object userAddedTopicList;
    @SerializedName(value="link")
    private String link;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="templateId")
    private int templateId;
    @SerializedName(value="launchPage")
    private LaunchPage launchPage;
    @SerializedName(value="communityHeat")
    private float communityHeat;
    @SerializedName(value="endpoint")
    private String endpoint;
    @SerializedName(value="ndcId")
    private int ndcId;
    @SerializedName(value="joinType")
    private int joinType;
    @SerializedName(value="listedStatus")
    private int listedStatus;
    @SerializedName(value="name")
    private String name;
    @SerializedName(value="tagline")
    private String tagline;
    @SerializedName(value="createdTime")
    private String createdTime;
    @SerializedName(value="activeInfo")
    private ActiveInfo activeInfo;
    @SerializedName(value="strategyInfo")
    private String strategyInfo;
    @SerializedName(value="primaryLanguage")
    private String primaryLanguage;
    @SerializedName(value="status")
    private int status;

    public String getModifiedTime() {
        return this.modifiedTime;
    }

    public Agent getAgent() {
        return this.agent;
    }

    public int getMembersCount() {
        return this.membersCount;
    }

    public int getProbationStatus() {
        return this.probationStatus;
    }

    public Object getPromotionalMediaList() {
        return this.promotionalMediaList;
    }

    public ThemePack getThemePack() {
        return this.themePack;
    }

    public Object getUserAddedTopicList() {
        return this.userAddedTopicList;
    }

    public String getLink() {
        return this.link;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getTemplateId() {
        return this.templateId;
    }

    public LaunchPage getLaunchPage() {
        return this.launchPage;
    }

    public float getCommunityHeat() {
        return this.communityHeat;
    }

    public String getEndpoint() {
        return this.endpoint;
    }

    public int getNdcId() {
        return this.ndcId;
    }

    public int getJoinType() {
        return this.joinType;
    }

    public int getListedStatus() {
        return this.listedStatus;
    }

    public String getName() {
        return this.name;
    }

    public String getTagline() {
        return this.tagline;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public ActiveInfo getActiveInfo() {
        return this.activeInfo;
    }

    public String getStrategyInfo() {
        return this.strategyInfo;
    }

    public String getPrimaryLanguage() {
        return this.primaryLanguage;
    }

    public int getStatus() {
        return this.status;
    }
}

