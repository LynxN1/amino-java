package pojo.response.sub_clients;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class LaunchPage{

	@SerializedName("mediaList")
	private List<Object> mediaList;

	@SerializedName("title")
	private String title;

	public List<Object> getMediaList(){
		return mediaList;
	}

	public String getTitle(){
		return title;
	}
}