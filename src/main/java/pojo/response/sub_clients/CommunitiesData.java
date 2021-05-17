package pojo.response.sub_clients;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CommunitiesData {

	@SerializedName("communityList")
	private List<CommunityListItem> communityList;

	public List<CommunityListItem> getCommunityList(){
		return communityList;
	}
}