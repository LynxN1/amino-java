package amino.models.response.thread_list;

import amino.models.response.thread_list.Author;
import amino.models.response.thread_list.Extensions;
import amino.models.response.thread_list.LastMessageSummary;
import amino.models.response.thread_list.MembersSummaryItem;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ThreadListItem {
    @SerializedName(value="modifiedTime")
    private Object modifiedTime;
    @SerializedName(value="membersQuota")
    private int membersQuota;
    @SerializedName(value="keywords")
    private Object keywords;
    @SerializedName(value="needHidden")
    private boolean needHidden;
    @SerializedName(value="lastReadTime")
    private String lastReadTime;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="title")
    private String title;
    @SerializedName(value="type")
    private int type;
    @SerializedName(value="content")
    private String content;
    @SerializedName(value="threadId")
    private String threadId;
    @SerializedName(value="latestActivityTime")
    private String latestActivityTime;
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="ndcId")
    private int ndcId;
    @SerializedName(value="createdTime")
    private Object createdTime;
    @SerializedName(value="alertOption")
    private int alertOption;
    @SerializedName(value="membersCount")
    private int membersCount;
    @SerializedName(value="membersSummary")
    private List<MembersSummaryItem> membersSummary;
    @SerializedName(value="isPinned")
    private boolean isPinned;
    @SerializedName(value="author")
    private Author author;
    @SerializedName(value="userAddedTopicList")
    private List<Object> userAddedTopicList;
    @SerializedName(value="lastMessageSummary")
    private LastMessageSummary lastMessageSummary;
    @SerializedName(value="membershipStatus")
    private int membershipStatus;
    @SerializedName(value="condition")
    private int condition;
    @SerializedName(value="extensions")
    private Extensions extensions;
    @SerializedName(value="strategyInfo")
    private String strategyInfo;
    @SerializedName(value="status")
    private int status;
    @SerializedName(value="publishToGlobal")
    private int publishToGlobal;

    public Object getModifiedTime() {
        return this.modifiedTime;
    }

    public int getMembersQuota() {
        return this.membersQuota;
    }

    public Object getKeywords() {
        return this.keywords;
    }

    public boolean isNeedHidden() {
        return this.needHidden;
    }

    public String getLastReadTime() {
        return this.lastReadTime;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getContent() {
        return this.content;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public String getLatestActivityTime() {
        return this.latestActivityTime;
    }

    public String getUid() {
        return this.uid;
    }

    public int getNdcId() {
        return this.ndcId;
    }

    public Object getCreatedTime() {
        return this.createdTime;
    }

    public int getAlertOption() {
        return this.alertOption;
    }

    public int getMembersCount() {
        return this.membersCount;
    }

    public List<MembersSummaryItem> getMembersSummary() {
        return this.membersSummary;
    }

    public boolean isIsPinned() {
        return this.isPinned;
    }

    public Author getAuthor() {
        return this.author;
    }

    public List<Object> getUserAddedTopicList() {
        return this.userAddedTopicList;
    }

    public LastMessageSummary getLastMessageSummary() {
        return this.lastMessageSummary;
    }

    public int getMembershipStatus() {
        return this.membershipStatus;
    }

    public int getCondition() {
        return this.condition;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public String getStrategyInfo() {
        return this.strategyInfo;
    }

    public int getStatus() {
        return this.status;
    }

    public int getPublishToGlobal() {
        return this.publishToGlobal;
    }
}

