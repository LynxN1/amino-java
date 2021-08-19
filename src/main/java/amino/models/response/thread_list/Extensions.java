package amino.models.response.thread_list;

import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Extensions {
    @SerializedName(value="lastMembersSummaryUpdateTime")
    private int lastMembersSummaryUpdateTime;
    @SerializedName(value="coHost")
    private List<String> coHost;
    @SerializedName(value="language")
    private String language;
    @SerializedName(value="pinAnnouncement")
    private boolean pinAnnouncement;
    @SerializedName(value="bm")
    private List<JsonElement> bm;
    @SerializedName(value="announcement")
    private String announcement;
    @SerializedName(value="membersCanInvite")
    private boolean membersCanInvite;
    @SerializedName(value="fansOnly")
    private boolean fansOnly;
    @SerializedName(value="visibility")
    private int visibility;
    @SerializedName(value="channelType")
    private int channelType;
    @SerializedName(value="avchatMemberUidList")
    private List<String> avchatMemberUidList;
    @SerializedName(value="creatorUid")
    private String creatorUid;
    @SerializedName(value="bannedMemberUidList")
    private List<String> bannedMemberUidList;
    @SerializedName(value="viewOnly")
    private boolean viewOnly;
    @SerializedName(value="vvChatJoinType")
    private int vvChatJoinType;
    @SerializedName(value="screeningRoomPermission")
    private ScreeningRoomPermission screeningRoomPermission;

    public int getLastMembersSummaryUpdateTime() {
        return this.lastMembersSummaryUpdateTime;
    }

    public List<String> getCoHost() {
        return this.coHost;
    }

    public String getLanguage() {
        return this.language;
    }

    public boolean isPinAnnouncement() {
        return this.pinAnnouncement;
    }

    public List<JsonElement> getBm() {
        return this.bm;
    }

    public String getAnnouncement() {
        return this.announcement;
    }

    public boolean isMembersCanInvite() {
        return this.membersCanInvite;
    }

    public boolean isFansOnly() {
        return this.fansOnly;
    }

    public int getVisibility() {
        return this.visibility;
    }

    public int getChannelType() {
        return this.channelType;
    }

    public List<String> getAvchatMemberUidList() {
        return this.avchatMemberUidList;
    }

    public String getCreatorUid() {
        return this.creatorUid;
    }

    public List<String> getBannedMemberUidList() {
        return this.bannedMemberUidList;
    }

    public boolean isViewOnly() {
        return this.viewOnly;
    }

    public int getVvChatJoinType() {
        return this.vvChatJoinType;
    }

    public ScreeningRoomPermission getScreeningRoomPermission() {
        return this.screeningRoomPermission;
    }
}

