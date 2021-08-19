package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CommunitiesData {
    @SerializedName(value="communityList")
    private List<CommunityListItem> communityList;

    public List<CommunityListItem> getCommunityList() {
        return this.communityList;
    }
}

