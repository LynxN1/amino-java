package pojo.response.account;

import com.google.gson.annotations.SerializedName;

public class DeviceInfo{

	@SerializedName("lastClientType")
	private int lastClientType;

	public int getLastClientType(){
		return lastClientType;
	}
}