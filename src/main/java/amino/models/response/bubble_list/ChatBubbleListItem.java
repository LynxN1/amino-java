package amino.models.response.bubble_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ChatBubbleListItem{

	@SerializedName("modifiedTime")
	private String modifiedTime;

	@SerializedName("backgroundImage")
	private Object backgroundImage;

	@SerializedName("ownershipStatus")
	private int ownershipStatus;

	@SerializedName("deletable")
	private boolean deletable;

	@SerializedName("restrictionInfo")
	private RestrictionInfo restrictionInfo;

	@SerializedName("isActivated")
	private boolean isActivated;

	@SerializedName("isNew")
	private boolean isNew;

	@SerializedName("availableNdcIds")
	private List<Object> availableNdcIds;

	@SerializedName("templateId")
	private String templateId;

	@SerializedName("version")
	private int version;

	@SerializedName("uid")
	private String uid;

	@SerializedName("bannerImage")
	private String bannerImage;

	@SerializedName("extensions")
	private Object extensions;

	@SerializedName("resourceUrl")
	private String resourceUrl;

	@SerializedName("coverImage")
	private String coverImage;

	@SerializedName("isGloballyAvailable")
	private boolean isGloballyAvailable;

	@SerializedName("name")
	private String name;

	@SerializedName("bubbleId")
	private String bubbleId;

	@SerializedName("ownershipInfo")
	private OwnershipInfo ownershipInfo;

	@SerializedName("createdTime")
	private String createdTime;

	@SerializedName("bubbleType")
	private int bubbleType;

	@SerializedName("config")
	private Config config;

	@SerializedName("status")
	private int status;

	@SerializedName("md5")
	private String md5;

	public String getModifiedTime(){
		return modifiedTime;
	}

	public Object getBackgroundImage(){
		return backgroundImage;
	}

	public int getOwnershipStatus(){
		return ownershipStatus;
	}

	public boolean isDeletable(){
		return deletable;
	}

	public RestrictionInfo getRestrictionInfo(){
		return restrictionInfo;
	}

	public boolean isIsActivated(){
		return isActivated;
	}

	public boolean isIsNew(){
		return isNew;
	}

	public List<Object> getAvailableNdcIds(){
		return availableNdcIds;
	}

	public String getTemplateId(){
		return templateId;
	}

	public int getVersion(){
		return version;
	}

	public String getUid(){
		return uid;
	}

	public String getBannerImage(){
		return bannerImage;
	}

	public Object getExtensions(){
		return extensions;
	}

	public String getResourceUrl(){
		return resourceUrl;
	}

	public String getCoverImage(){
		return coverImage;
	}

	public boolean isIsGloballyAvailable(){
		return isGloballyAvailable;
	}

	public String getName(){
		return name;
	}

	public String getBubbleId(){
		return bubbleId;
	}

	public OwnershipInfo getOwnershipInfo(){
		return ownershipInfo;
	}

	public String getCreatedTime(){
		return createdTime;
	}

	public int getBubbleType(){
		return bubbleType;
	}

	public Config getConfig(){
		return config;
	}

	public int getStatus(){
		return status;
	}

	public String getMd5(){
		return md5;
	}
}