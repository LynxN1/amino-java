package amino.models.response.link_info;

import com.google.gson.annotations.SerializedName;

public class LinkInfo {
    @SerializedName(value="fullPath")
    private String fullPath;
    @SerializedName(value="ndcId")
    private int ndcId;
    @SerializedName(value="targetCode")
    private int targetCode;
    @SerializedName(value="objectId")
    private String objectId;
    @SerializedName(value="shortCode")
    private String shortCode;
    @SerializedName(value="objectType")
    private int objectType;

    public String getFullPath() {
        return this.fullPath;
    }

    public int getNdcId() {
        return this.ndcId;
    }

    public int getTargetCode() {
        return this.targetCode;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public String getShortCode() {
        return this.shortCode;
    }

    public int getObjectType() {
        return this.objectType;
    }
}

