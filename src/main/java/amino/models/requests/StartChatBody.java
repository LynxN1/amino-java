package amino.models.requests;

import java.util.List;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class StartChatBody{

	@SerializedName("inviteeUids")
	private List<String> inviteeUids;

	@SerializedName("title")
	private String title;

	@SerializedName("type")
	private int type = 0;

	@SerializedName("content")
	private String content;

	@SerializedName("initialMessageContent")
	private String initialMessageContent;

	@SerializedName("publishToGlobal")
	private int publishToGlobal = 0;

	@SerializedName("timestamp")
	private long timestamp = TimeUtils.unixInstant();

	public void setInviteeUids(List<String> inviteeUids){
		this.inviteeUids = inviteeUids;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public void setType(int type){
		this.type = type;
	}

	public void setContent(String content){
		this.content = content;
	}

	public void setInitialMessageContent(String initialMessageContent){
		this.initialMessageContent = initialMessageContent;
	}

	public void setPublishToGlobal(int publishToGlobal){
		this.publishToGlobal = publishToGlobal;
	}
}