package pojo.response.thread_list;

import com.google.gson.annotations.SerializedName;

public class LastMessageSummary{

	@SerializedName("uid")
	private String uid;

	@SerializedName("mediaValue")
	private Object mediaValue;

	@SerializedName("messageId")
	private String messageId;

	@SerializedName("createdTime")
	private String createdTime;

	@SerializedName("mediaType")
	private int mediaType;

	@SerializedName("type")
	private int type;

	@SerializedName("content")
	private String content;

	@SerializedName("isHidden")
	private boolean isHidden;

	public String getUid(){
		return uid;
	}

	public Object getMediaValue(){
		return mediaValue;
	}

	public String getMessageId(){
		return messageId;
	}

	public String getCreatedTime(){
		return createdTime;
	}

	public int getMediaType(){
		return mediaType;
	}

	public int getType(){
		return type;
	}

	public String getContent(){
		return content;
	}

	public boolean isIsHidden(){
		return isHidden;
	}
}