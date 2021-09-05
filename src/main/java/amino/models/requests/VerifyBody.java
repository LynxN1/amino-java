package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class VerifyBody{

	@SerializedName("validationContext")
	private ValidationContext validationContext;

	@SerializedName("deviceID")
	private String deviceID;

	@SerializedName("timestamp")
	private long timestamp = TimeUtils.unixInstant();

	public void setValidationContext(ValidationContext validationContext){
		this.validationContext = validationContext;
	}

	public void setDeviceID(String deviceID){
		this.deviceID = deviceID;
	}
}