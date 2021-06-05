package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CommunitiesData {

  @SerializedName("communityList")
  private List<CommunityListItem> communityList;

  public List<CommunityListItem> getCommunityList() {
    return communityList;
  }
}