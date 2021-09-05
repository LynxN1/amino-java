package amino.models.response.blog_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BlogList{

	@SerializedName("blogList")
	private List<BlogListItem> blogList;

	public List<BlogListItem> getBlogList(){
		return blogList;
	}
}