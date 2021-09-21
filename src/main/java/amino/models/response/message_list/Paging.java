package amino.models.response.message_list;

import com.google.gson.annotations.SerializedName;

public class Paging{

	@SerializedName("prevPageToken")
	private String prevPageToken;

	@SerializedName("nextPageToken")
	private String nextPageToken;

	public String getPrevPageToken(){
		return prevPageToken;
	}

	public String getNextPageToken(){
		return nextPageToken;
	}
}