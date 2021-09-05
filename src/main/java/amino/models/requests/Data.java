package amino.models.requests;

import com.google.gson.annotations.SerializedName;

public class Data{

	@SerializedName("code")
	private String code;

	public void setCode(String code){
		this.code = code;
	}
}