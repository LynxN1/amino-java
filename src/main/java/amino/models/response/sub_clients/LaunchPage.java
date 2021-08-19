package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LaunchPage {
    @SerializedName(value="mediaList")
    private List<Object> mediaList;
    @SerializedName(value="title")
    private String title;

    public List<Object> getMediaList() {
        return this.mediaList;
    }

    public String getTitle() {
        return this.title;
    }
}

