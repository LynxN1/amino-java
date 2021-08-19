package amino.models.response.message_list;

import com.google.gson.annotations.SerializedName;

public class LastMessageSummary {
    @SerializedName(value="uid")
    private String uid;
    @SerializedName(value="mediaValue")
    private String mediaValue;
    @SerializedName(value="messageId")
    private String messageId;
    @SerializedName(value="createdTime")
    private String createdTime;
    @SerializedName(value="mediaType")
    private String mediaType;
    @SerializedName(value="type")
    private int type;
    @SerializedName(value="content")
    private String content;
    @SerializedName(value="isHidden")
    private boolean isHidden;

    public String getUid() {
        return this.uid;
    }

    public String getMediaValue() {
        return this.mediaValue;
    }

    public String getMessageId() {
        return this.messageId;
    }

    public String getCreatedTime() {
        return this.createdTime;
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
}

