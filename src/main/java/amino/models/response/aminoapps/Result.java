package amino.models.response.aminoapps;

import com.google.gson.annotations.SerializedName;

public class Result{

	@SerializedName("uid")
	private String uid;

	@SerializedName("nickname")
	private String nickname;

	@SerializedName("isMember")
	private boolean isMember;

	public String getUid(){
		return uid;
	}

	public String getNickname(){
		return nickname;
	}

	public boolean isIsMember(){
		return isMember;
	}
}