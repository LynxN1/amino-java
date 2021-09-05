package amino.models.response.blog_list;

import com.google.gson.annotations.SerializedName;

public class Extensions{

	@SerializedName("style")
	private Style style;

	@SerializedName("fansOnly")
	private boolean fansOnly;

	public Style getStyle(){
		return style;
	}

	public boolean isFansOnly(){
		return fansOnly;
	}
}