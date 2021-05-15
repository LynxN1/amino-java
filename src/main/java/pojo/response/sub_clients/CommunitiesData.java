package pojo.response.sub_clients;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CommunitiesData {

	@SerializedName("api:timestamp")
	private String apiTimestamp;

	@SerializedName("api:duration")
	private String apiDuration;

	@SerializedName("api:statuscode")
	private int apiStatuscode;

	@SerializedName("communityList")
	private List<CommunityListItem> communityList;

	@SerializedName("api:message")
	private String apiMessage;

	public String getApiTimestamp(){
		return apiTimestamp;
	}

	public String getApiDuration(){
		return apiDuration;
	}

	public int getApiStatuscode(){
		return apiStatuscode;
	}

	public List<CommunityListItem> getCommunityList(){
		return communityList;
	}

	public String getApiMessage(){
		return apiMessage;
	}
}