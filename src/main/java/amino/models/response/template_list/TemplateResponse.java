package amino.models.response.template_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TemplateResponse{
	@SerializedName("templateList")
	private List<TemplateListItem> templateList;

	public List<TemplateListItem> getTemplateList(){
		return templateList;
	}
}