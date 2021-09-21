package amino.models.response.event_log;

import com.google.gson.annotations.SerializedName;

public class EventLogResponse{

	@SerializedName("interestPickerStyle")
	private int interestPickerStyle;

	@SerializedName("auid")
	private String auid;

	@SerializedName("landingOption")
	private int landingOption;

	@SerializedName("uid")
	private String uid;

	@SerializedName("signUpStrategy")
	private int signUpStrategy;

	@SerializedName("needTriggerInterestPicker")
	private boolean needTriggerInterestPicker;

	@SerializedName("globalStrategyInfo")
	private String globalStrategyInfo;

	@SerializedName("contentLanguage")
	private String contentLanguage;

	@SerializedName("participatedExperiments")
	private ParticipatedExperiments participatedExperiments;

	public int getInterestPickerStyle(){
		return interestPickerStyle;
	}

	public String getAuid(){
		return auid;
	}

	public int getLandingOption(){
		return landingOption;
	}

	public String getUid(){
		return uid;
	}

	public int getSignUpStrategy(){
		return signUpStrategy;
	}

	public boolean isNeedTriggerInterestPicker(){
		return needTriggerInterestPicker;
	}

	public String getGlobalStrategyInfo(){
		return globalStrategyInfo;
	}

	public String getContentLanguage(){
		return contentLanguage;
	}

	public ParticipatedExperiments getParticipatedExperiments(){
		return participatedExperiments;
	}
}