package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class LoginBody{

	@SerializedName("clientType")
	private int clientType = 100;

	@SerializedName("v")
	private int V = 2;

	@SerializedName("action")
	private String action = "normal";

	@SerializedName("secret")
	private String secret;

	@SerializedName("deviceID")
	private String deviceID;

	@SerializedName("email")
	private String email;

	@SerializedName("timestamp")
	private long timestamp = TimeUtils.unixInstant();

	public void setSecret(String secret){
		this.secret = secret;
	}

	public void setDeviceID(String deviceID){
		this.deviceID = deviceID;
	}

	public void setEmail(String email){
		this.email = email;
	}
}