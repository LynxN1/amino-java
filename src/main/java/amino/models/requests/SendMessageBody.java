package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class SendMessageBody{

	@SerializedName("extensions")
	private Extensions extensions;

	@SerializedName("clientRefId")
	private long clientRefId = TimeUtils.unixInstant() / 1000;

	@SerializedName("type")
	private int type;

	@SerializedName("content")
	private String content;

	@SerializedName("attachedObject")
	private final Object attachedObject = null;

	@SerializedName("timestamp")
	private long timestamp = TimeUtils.unixInstant();

	public void setExtensions(Extensions extensions){
		this.extensions = extensions;
	}

	public void setType(int type){
		this.type = type;
	}

	public void setContent(String content){
		this.content = content;
	}
}