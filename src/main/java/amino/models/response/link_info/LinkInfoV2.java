package amino.models.response.link_info;

import com.google.gson.annotations.SerializedName;

public class LinkInfoV2 {
    @SerializedName(value="path")
    private String path;
    @SerializedName(value="extensions")
    private Extensions extensions;

    public String getPath() {
        return this.path;
    }

    public Extensions getExtensions() {
        return this.extensions;
    }
}

