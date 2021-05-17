package pojo.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class NdcAccount {

	@SerializedName("api:timestamp")
	private String apiTimestamp;

	@SerializedName("api:duration")
	private String apiDuration;

	@SerializedName("api:statuscode")
	private int apiStatuscode;

	@SerializedName("api:message")
	private String apiMessage;

	@SerializedName("userProfile")
	private UserProfile userProfile;

	public String getApiTimestamp(){
		return apiTimestamp;
	}

	public String getApiDuration(){
		return apiDuration;
	}

	public int getApiStatuscode(){
		return apiStatuscode;
	}

	public String getApiMessage(){
		return apiMessage;
	}

	public UserProfile getUserProfile(){
		return userProfile;
	}
}