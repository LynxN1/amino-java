package amino.models.requests;

public class StartChatBody {
    private String title;
    private String inviteeUids;
    private Integer timestamp;
    private Integer type;
    private Boolean publishToGlobal;

    public void title(String title) {
        this.title = title;
    }

    public StartChatBody inviteeUids(String inviteeUids) {
        this.inviteeUids = inviteeUids;
        return this;
    }

    public StartChatBody timestamp(Integer timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public StartChatBody type(Integer type) {
        this.type = type;
        return this;
    }

    public StartChatBody publishToGlobal(Boolean publishToGlobal) {
        this.publishToGlobal = publishToGlobal;
        return this;
    }
}

