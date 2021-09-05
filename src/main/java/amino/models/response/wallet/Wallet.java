package amino.models.response.wallet;

import com.google.gson.annotations.SerializedName;

public class Wallet{

	@SerializedName("totalBusinessCoins")
	private int totalBusinessCoins;

	@SerializedName("adsVideoStats")
	private Object adsVideoStats;

	@SerializedName("totalBusinessCoinsFloat")
	private int totalBusinessCoinsFloat;

	@SerializedName("totalCoinsFloat")
	private double totalCoinsFloat;

	@SerializedName("totalCoins")
	private double totalCoins;

	@SerializedName("adsFlags")
	private int adsFlags;

	@SerializedName("businessCoinsEnabled")
	private boolean businessCoinsEnabled;

	@SerializedName("adsEnabled")
	private boolean adsEnabled;

	public int getTotalBusinessCoins(){
		return totalBusinessCoins;
	}

	public Object getAdsVideoStats(){
		return adsVideoStats;
	}

	public int getTotalBusinessCoinsFloat(){
		return totalBusinessCoinsFloat;
	}

	public double getTotalCoinsFloat(){
		return totalCoinsFloat;
	}

	public double getTotalCoins(){
		return totalCoins;
	}

	public int getAdsFlags(){
		return adsFlags;
	}

	public boolean isBusinessCoinsEnabled(){
		return businessCoinsEnabled;
	}

	public boolean isAdsEnabled(){
		return adsEnabled;
	}
}