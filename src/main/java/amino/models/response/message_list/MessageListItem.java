package amino.models.response.message_list;

import com.google.gson.annotations.SerializedName;

public class MessageListItem {
    @SerializedName(value="clientRefId")
    private int clientRefId;
    @SerializedName(value="author")
    private Author author;
    @SerializedName(value="messageId")
    private String messageId;
    @SerializedName(value="mediaType")
    private String mediaType;
    @SerializedName(value="type")
    private int type;
    @SerializedName(value="content")
    private String content;
    @SerializedName(value="isHidden")
    private boolean isHidden;
    @SerializedName(value="threadId")
    private String threadId;
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="extensions")
    private Extensions extensions;
    @SerializedName(value="mediaValue")
    private String mediaValue;
    @SerializedName(value="createdTime")
    private String createdTime;
    @SerializedName(value="includedInSummary")
    private boolean includedInSummary;

    public int getClientRefId() {
        return this.clientRefId;
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public int getType() {
        return this.type;
    }

    public String getContent() {
        return this.content;
    }

    public boolean isIsHidden() {
        return this.isHidden;
    }

    public String getThreadId() {
        return this.threadId;
    }

    public String getUid() {
        return this.uid;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }

    public String getMediaValue() {
        return this.mediaValue;
    }

    public String getCreatedTime() {
        return this.createdTime;
    }

    public boolean isIncludedInSummary() {
        return this.includedInSummary;
    }
}

