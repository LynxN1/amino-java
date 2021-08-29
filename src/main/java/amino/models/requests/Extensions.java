package amino.models.requests;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Extensions{

	@SerializedName("mentionedArray")
	private List<MentionedArrayItem> mentionedArray;

	public void setMentionedArray(List<MentionedArrayItem> mentionedArray){
		this.mentionedArray = mentionedArray;
	}
}