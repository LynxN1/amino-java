package amino.models.requests;

import amino.utils.TimeUtils;

public class SendMessageBody {
    private Integer type;
    private String content;
    private AttachedObject attachedObject;
    private Integer timestamp = TimeUtils.unixInstant();
    private Integer clientRefId = TimeUtils.unixInstant();

    public SendMessageBody type(Integer type) {
        this.type = type;
        return this;
    }

    public SendMessageBody content(String content) {
        this.content = content;
        return this;
    }

    public SendMessageBody attachedObject(AttachedObject AttachedObject2) {
        this.attachedObject = AttachedObject2;
        return this;
    }
}
