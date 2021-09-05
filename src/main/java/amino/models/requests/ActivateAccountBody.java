package amino.models.requests;

import com.google.gson.annotations.SerializedName;

public class ActivateAccountBody{

	@SerializedName("data")
	private Data data;

	@SerializedName("identity")
	private String identity;

	@SerializedName("type")
	private int type = 1;

	@SerializedName("deviceID")
	private String deviceID;

	public void setData(Data data){
		this.data = data;
	}

	public void setIdentity(String identity){
		this.identity = identity;
	}

	public void setDeviceID(String deviceID){
		this.deviceID = deviceID;
	}
}