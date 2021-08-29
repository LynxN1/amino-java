package amino.models.requests;

import com.google.gson.annotations.SerializedName;

public class MentionedArrayItem{

	@SerializedName("uid")
	private String uid;

	public void setUid(String uid){
		this.uid = uid;
	}
}