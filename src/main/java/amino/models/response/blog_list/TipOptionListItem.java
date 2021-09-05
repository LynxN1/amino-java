package amino.models.response.blog_list;

import com.google.gson.annotations.SerializedName;

public class TipOptionListItem{

	@SerializedName("icon")
	private String icon;

	@SerializedName("value")
	private int value;

	public String getIcon(){
		return icon;
	}

	public int getValue(){
		return value;
	}
}