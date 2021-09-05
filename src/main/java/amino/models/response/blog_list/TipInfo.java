package amino.models.response.blog_list;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TipInfo{

	@SerializedName("tippable")
	private boolean tippable;

	@SerializedName("tipCustomOption")
	private TipCustomOption tipCustomOption;

	@SerializedName("tippersCount")
	private int tippersCount;

	@SerializedName("tipMaxCoin")
	private int tipMaxCoin;

	@SerializedName("tipOptionList")
	private List<TipOptionListItem> tipOptionList;

	@SerializedName("tippedCoins")
	private int tippedCoins;

	@SerializedName("tipMinCoin")
	private int tipMinCoin;

	public boolean isTippable(){
		return tippable;
	}

	public TipCustomOption getTipCustomOption(){
		return tipCustomOption;
	}

	public int getTippersCount(){
		return tippersCount;
	}

	public int getTipMaxCoin(){
		return tipMaxCoin;
	}

	public List<TipOptionListItem> getTipOptionList(){
		return tipOptionList;
	}

	public int getTippedCoins(){
		return tippedCoins;
	}

	public int getTipMinCoin(){
		return tipMinCoin;
	}
}