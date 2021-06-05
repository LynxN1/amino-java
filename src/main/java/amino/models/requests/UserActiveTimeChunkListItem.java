package amino.models.requests;

public class UserActiveTimeChunkListItem{

	private int start;
	private int end;

	public UserActiveTimeChunkListItem start(int start){
		this.start = start;
		return this;
	}

	public UserActiveTimeChunkListItem end(int end){
		this.end = end;
		return this;
	}
}