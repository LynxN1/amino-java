package amino.models.response.message_list;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MessageListResponse {
    @SerializedName(value="messageList")
    private List<MessageListItem> messageList;
    @SerializedName(value="thread")
    private Thread thread;
    @SerializedName("paging")
    private Paging paging;

    public List<MessageListItem> getMessageList() {
        return this.messageList;
    }

    public Thread getThread() {
        return this.thread;
    }

    public Paging getPaging(){
        return paging;
    }
}
