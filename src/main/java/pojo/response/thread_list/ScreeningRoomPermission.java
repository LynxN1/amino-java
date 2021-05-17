package pojo.response.thread_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ScreeningRoomPermission{

	@SerializedName("uidList")
	private List<Object> uidList;

	@SerializedName("action")
	private int action;

	public List<Object> getUidList(){
		return uidList;
	}

	public int getAction(){
		return action;
	}
}