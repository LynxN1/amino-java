package amino.models.requests;

import com.google.gson.annotations.SerializedName;

public class RequestVerifyBody{

	@SerializedName("identity")
	private String identity;

	@SerializedName("type")
	private int type = 1;

	@SerializedName("deviceID")
	private String deviceID;

	public void setIdentity(String identity){
		this.identity = identity;
	}

	public void setDeviceID(String deviceID){
		this.deviceID = deviceID;
	}
}