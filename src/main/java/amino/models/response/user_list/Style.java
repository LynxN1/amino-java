package amino.models.response.user_list;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Style {
    @SerializedName(value="backgroundColor")
    private String backgroundColor;
    @SerializedName(value="backgroundMediaList")
    private List<Integer> backgroundMediaList;

    public String getBackgroundColor() {
        return this.backgroundColor;
    }

    public List<Integer> getBackgroundMediaList() {
        return this.backgroundMediaList;
    }
}

