package amino.models.response.account;

import com.google.gson.annotations.SerializedName;

public class AvatarFrame {

  @SerializedName("resourceUrl")
  private String resourceUrl;

  @SerializedName("frameId")
  private String frameId;

  @SerializedName("ownershipStatus")
  private Object ownershipStatus;

  @SerializedName("name")
  private String name;

  @SerializedName("icon")
  private String icon;

  @SerializedName("frameType")
  private int frameType;

  @SerializedName("version")
  private int version;

  @SerializedName("status")
  private int status;

  public String getResourceUrl() {
    return resourceUrl;
  }

  public String getFrameId() {
    return frameId;
  }

  public Object getOwnershipStatus() {
    return ownershipStatus;
  }

  public String getName() {
    return name;
  }

  public String getIcon() {
    return icon;
  }

  public int getFrameType() {
    return frameType;
  }

  public int getVersion() {
    return version;
  }

  public int getStatus() {
    return status;
  }
}