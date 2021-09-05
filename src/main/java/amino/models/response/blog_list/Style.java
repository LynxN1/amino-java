package amino.models.response.blog_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Style{

	@SerializedName("coverMediaIndexList")
	private List<Object> coverMediaIndexList;

	public List<Object> getCoverMediaIndexList(){
		return coverMediaIndexList;
	}
}