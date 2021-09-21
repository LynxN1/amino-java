package amino.models.response.bubble_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Config{

	@SerializedName("vertexInset")
	private int vertexInset;

	@SerializedName("backgroundPath")
	private String backgroundPath;

	@SerializedName("color")
	private String color;

	@SerializedName("contentInsets")
	private List<Integer> contentInsets;

	@SerializedName("linkColor")
	private String linkColor;

	@SerializedName("templateId")
	private String templateId;

	@SerializedName("version")
	private int version;

	@SerializedName("allowedSlots")
	private List<AllowedSlotsItem> allowedSlots;

	@SerializedName("slots")
	private Object slots;

	@SerializedName("zoomPoint")
	private List<Integer> zoomPoint;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("name")
	private String name;

	@SerializedName("bubbleType")
	private int bubbleType;

	@SerializedName("id")
	private String id;

	@SerializedName("status")
	private int status;

	@SerializedName("previewBackgroundUrl")
	private String previewBackgroundUrl;

	public int getVertexInset(){
		return vertexInset;
	}

	public String getBackgroundPath(){
		return backgroundPath;
	}

	public String getColor(){
		return color;
	}

	public List<Integer> getContentInsets(){
		return contentInsets;
	}

	public String getLinkColor(){
		return linkColor;
	}

	public String getTemplateId(){
		return templateId;
	}

	public int getVersion(){
		return version;
	}

	public List<AllowedSlotsItem> getAllowedSlots(){
		return allowedSlots;
	}

	public Object getSlots(){
		return slots;
	}

	public List<Integer> getZoomPoint(){
		return zoomPoint;
	}

	public String getCoverImage(){
		return coverImage;
	}

	public String getName(){
		return name;
	}

	public int getBubbleType(){
		return bubbleType;
	}

	public String getId(){
		return id;
	}

	public int getStatus(){
		return status;
	}

	public String getPreviewBackgroundUrl(){
		return previewBackgroundUrl;
	}
}