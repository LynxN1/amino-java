package amino.models.response.bubble_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class BubbleListResponse{

	@SerializedName("allChatsBubbleId")
	private Object allChatsBubbleId;

	@SerializedName("currentSelectedBubbleId")
	private Object currentSelectedBubbleId;

	@SerializedName("chatBubbleList")
	private List<ChatBubbleListItem> chatBubbleList;

	public Object getAllChatsBubbleId(){
		return allChatsBubbleId;
	}

	public Object getCurrentSelectedBubbleId(){
		return currentSelectedBubbleId;
	}

	public List<ChatBubbleListItem> getChatBubbleList(){
		return chatBubbleList;
	}
}