package amino.models.response.bubble_list;

import com.google.gson.annotations.SerializedName;

public class RestrictionInfo{

	@SerializedName("ownerType")
	private int ownerType;

	@SerializedName("restrictType")
	private int restrictType;

	@SerializedName("discountStatus")
	private int discountStatus;

	@SerializedName("restrictValue")
	private int restrictValue;

	@SerializedName("ownerUid")
	private Object ownerUid;

	@SerializedName("availableDuration")
	private Object availableDuration;

	@SerializedName("discountValue")
	private Object discountValue;

	public int getOwnerType(){
		return ownerType;
	}

	public int getRestrictType(){
		return restrictType;
	}

	public int getDiscountStatus(){
		return discountStatus;
	}

	public int getRestrictValue(){
		return restrictValue;
	}

	public Object getOwnerUid(){
		return ownerUid;
	}

	public Object getAvailableDuration(){
		return availableDuration;
	}

	public Object getDiscountValue(){
		return discountValue;
	}
}