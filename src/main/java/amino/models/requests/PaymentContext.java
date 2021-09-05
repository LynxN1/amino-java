package amino.models.requests;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class PaymentContext{

	@SerializedName("isAutoRenew")
	private boolean isAutoRenew;

	@SerializedName("transactionId")
	private String transactionId = UUID.randomUUID().toString();

	public void setIsAutoRenew(boolean isAutoRenew){
		this.isAutoRenew = isAutoRenew;
	}
}