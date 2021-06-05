package amino.models.response.link_info;

import com.google.gson.annotations.SerializedName;

public class Extensions{

	@SerializedName("linkInfo")
	private LinkInfo linkInfo;

	public LinkInfo getLinkInfo(){
		return linkInfo;
	}
}