package amino.models.response.template_list;

import com.google.gson.annotations.SerializedName;

public class AllowedSlotsItem{

	@SerializedName("x")
	private int X;

	@SerializedName("y")
	private int Y;

	@SerializedName("align")
	private int align;

	public int getX(){
		return X;
	}

	public int getY(){
		return Y;
	}

	public int getAlign(){
		return align;
	}
}