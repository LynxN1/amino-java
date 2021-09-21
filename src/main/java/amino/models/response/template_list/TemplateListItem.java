package amino.models.response.template_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TemplateListItem{

	@SerializedName("modifiedTime")
	private String modifiedTime;

	@SerializedName("materialUrl")
	private String materialUrl;

	@SerializedName("color")
	private String color;

	@SerializedName("ndcId")
	private int ndcId;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private Object description;

	@SerializedName("createdTime")
	private String createdTime;

	@SerializedName("templateId")
	private String templateId;

	@SerializedName("config")
	private Config config;

	@SerializedName("status")
	private int status;

	public String getModifiedTime(){
		return modifiedTime;
	}

	public String getMaterialUrl(){
		return materialUrl;
	}

	public String getColor(){
		return color;
	}

	public int getNdcId(){
		return ndcId;
	}

	public String getName(){
		return name;
	}

	public Object getDescription(){
		return description;
	}

	public String getCreatedTime(){
		return createdTime;
	}

	public String getTemplateId(){
		return templateId;
	}

	public Config getConfig(){
		return config;
	}

	public int getStatus(){
		return status;
	}
}