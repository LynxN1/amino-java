package amino.models.requests;

import com.google.gson.annotations.SerializedName;

public class ValidationContext{

	@SerializedName("data")
	private Data data;

	@SerializedName("identity")
	private String identity;

	@SerializedName("type")
	private int type = 1;

	public void setData(Data data){
		this.data = data;
	}

	public void setIdentity(String identity){
		this.identity = identity;
	}
}