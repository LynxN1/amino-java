package amino.models.response.blog_list;

import com.google.gson.annotations.SerializedName;

public class TipCustomOption{

	@SerializedName("icon")
	private String icon;

	@SerializedName("value")
	private Object value;

	public String getIcon(){
		return icon;
	}

	public Object getValue(){
		return value;
	}
}