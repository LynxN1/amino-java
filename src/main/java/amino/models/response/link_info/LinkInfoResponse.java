package amino.models.response.link_info;

import com.google.gson.annotations.SerializedName;

public class LinkInfoResponse {
    @SerializedName(value="linkInfoV2")
    private LinkInfoV2 linkInfoV2;

    public LinkInfoV2 getLinkInfoV2() {
        return this.linkInfoV2;
    }
}

