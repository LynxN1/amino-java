package amino.models.requests;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class TippingContext{

	@SerializedName("transactionId")
	private String transactionId = UUID.randomUUID().toString();
}