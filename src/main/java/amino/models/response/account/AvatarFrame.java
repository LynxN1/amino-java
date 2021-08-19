package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class AvatarFrame {
    @SerializedName(value="resourceUrl")
    private String resourceUrl;
    @SerializedName(value="frameId")
    private String frameId;
    @SerializedName(value="ownershipStatus")
    private Object ownershipStatus;
    @SerializedName(value="name")
    private String name;
    @SerializedName(value="icon")
    private String icon;
    @SerializedName(value="frameType")
    private int frameType;
    @SerializedName(value="version")
    private int version;
    @SerializedName(value="status")
    private int status;

    public String getResourceUrl() {
        return this.resourceUrl;
    }

    public String getFrameId() {
        return this.frameId;
    }

    public Object getOwnershipStatus() {
        return this.ownershipStatus;
    }

    public String getName() {
        return this.name;
    }

    public String getIcon() {
        return this.icon;
    }

    public int getFrameType() {
        return this.frameType;
    }

    public int getVersion() {
        return this.version;
    }

    public int getStatus() {
        return this.status;
    }
}

