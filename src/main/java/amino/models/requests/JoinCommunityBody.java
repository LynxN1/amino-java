package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class JoinCommunityBody {
    @SerializedName("timestamp")
    private long timestamp = TimeUtils.unixInstant();

    @SerializedName("invitationId")
    private String invitationId;

    public void setInvitationId(String invitationId){
        this.invitationId = invitationId;
    }
}
