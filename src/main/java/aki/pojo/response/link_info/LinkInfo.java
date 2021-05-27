package aki.pojo.response.link_info;

import com.google.gson.annotations.SerializedName;

public class LinkInfo{

	@SerializedName("linkInfoV2")
	private LinkInfoV2 linkInfoV2;

	@SerializedName("fullPath")
	private Object fullPath;

	@SerializedName("ndcId")
	private int ndcId;

	@SerializedName("targetCode")
	private int targetCode;

	@SerializedName("objectId")
	private String objectId;

	@SerializedName("shortCode")
	private Object shortCode;

	@SerializedName("objectType")
	private int objectType;

	public LinkInfoV2 getLinkInfoV2(){
		return linkInfoV2;
	}

	public Object getFullPath(){
		return fullPath;
	}

	public int getNdcId(){
		return ndcId;
	}

	public int getTargetCode(){
		return targetCode;
	}

	public String getObjectId(){
		return objectId;
	}

	public Object getShortCode(){
		return shortCode;
	}

	public int getObjectType(){
		return objectType;
	}
}