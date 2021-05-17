package pojo.requests;

import utils.TimeUtils;

public class SendMessageBody {
    public int type;
    public String content;
    public long clientRefId = TimeUtils.unixInstant();
    public AttachedObject attachedObject;
    public int timestamp = TimeUtils.unixInstant();
}