package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class SendCoinsBody {

	@SerializedName("coins")
	private int coins;

	@SerializedName("tippingContext")
	private TippingContext tippingContext = new TippingContext();

	@SerializedName("timestamp")
	private long timestamp = TimeUtils.unixInstant();

	public void setCoins(int coins){
		this.coins = coins;
	}
}