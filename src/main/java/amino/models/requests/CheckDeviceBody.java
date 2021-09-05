package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class CheckDeviceBody{

	@SerializedName("clientType")
	private int clientType = 100;

	@SerializedName("timezone")
	private int timezone = 120;

	@SerializedName("systemPushEnabled")
	private boolean systemPushEnabled = true;

	@SerializedName("bundleID")
	private String bundleID = "com.narvii.amino.master";

	@SerializedName("locale")
	private String locale = "ru-UA";

	@SerializedName("deviceID")
	private String deviceID;

	@SerializedName("timestamp")
	private long timestamp = TimeUtils.unixInstant();

	public void setDeviceID(String deviceID){
		this.deviceID = deviceID;
	}
}