package amino.models.response.message_list;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MessageListResponse {
    @SerializedName(value="api:timestamp")
    private String apiTimestamp;
    @SerializedName(value="messageList")
    private List<MessageListItem> messageList;
    @SerializedName(value="api:duration")
    private String apiDuration;
    @SerializedName(value="api:statuscode")
    private int apiStatuscode;
    @SerializedName(value="thread")
    private Thread thread;
    @SerializedName(value="api:message")
    private String apiMessage;

    public String getApiTimestamp() {
        return this.apiTimestamp;
    }

    public List<MessageListItem> getMessageList() {
        return this.messageList;
    }

    public String getApiDuration() {
        return this.apiDuration;
    }

    public int getApiStatuscode() {
        return this.apiStatuscode;
    }

    public Thread getThread() {
        return this.thread;
    }

    public String getApiMessage() {
        return this.apiMessage;
    }
}

