package amino.models.response.wallet;

import com.google.gson.annotations.SerializedName;

public class WalletResponse{

	@SerializedName("wallet")
	private Wallet wallet;

	public Wallet getWallet(){
		return wallet;
	}
}