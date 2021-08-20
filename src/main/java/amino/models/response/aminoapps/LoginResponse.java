package amino.models.response.aminoapps;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {

	@SerializedName("result")
	private Result result;

	@SerializedName("code")
	private int code;

	public Result getResult(){
		return result;
	}

	public int getCode(){
		return code;
	}
}