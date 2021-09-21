package amino.models.response.bubble_list;

import com.google.gson.annotations.SerializedName;

public class OwnershipInfo{

	@SerializedName("isAutoRenew")
	private boolean isAutoRenew;

	@SerializedName("ownershipStatus")
	private int ownershipStatus;

	@SerializedName("createdTime")
	private String createdTime;

	@SerializedName("expiredTime")
	private Object expiredTime;

	public boolean isIsAutoRenew(){
		return isAutoRenew;
	}

	public int getOwnershipStatus(){
		return ownershipStatus;
	}

	public String getCreatedTime(){
		return createdTime;
	}

	public Object getExpiredTime(){
		return expiredTime;
	}
}