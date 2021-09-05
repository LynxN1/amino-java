package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class SubscribeBody{

	@SerializedName("paymentContext")
	private PaymentContext paymentContext;

	@SerializedName("timestamp")
	private long timestamp = TimeUtils.unixInstant();

	public void setPaymentContext(PaymentContext paymentContext){
		this.paymentContext = paymentContext;
	}
}