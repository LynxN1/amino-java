package amino.models.response.template_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Config{

	@SerializedName("allowedSlots")
	private List<AllowedSlotsItem> allowedSlots;

	@SerializedName("zoomPoint")
	private List<Integer> zoomPoint;

	@SerializedName("color")
	private String color;

	@SerializedName("name")
	private String name;

	@SerializedName("contentInsets")
	private List<Integer> contentInsets;

	@SerializedName("linkColor")
	private String linkColor;

	@SerializedName("version")
	private int version;

	public List<AllowedSlotsItem> getAllowedSlots(){
		return allowedSlots;
	}

	public List<Integer> getZoomPoint(){
		return zoomPoint;
	}

	public String getColor(){
		return color;
	}

	public String getName(){
		return name;
	}

	public List<Integer> getContentInsets(){
		return contentInsets;
	}

	public String getLinkColor(){
		return linkColor;
	}

	public int getVersion(){
		return version;
	}
}