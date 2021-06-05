package amino.models.response.link_info;

import com.google.gson.annotations.SerializedName;

public class LinkInfoV2{

	@SerializedName("path")
	private String path;

	@SerializedName("extensions")
	private Extensions extensions;

	public String getPath(){
		return path;
	}

	public Extensions getExtensions(){
		return extensions;
	}
}