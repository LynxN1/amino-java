package amino.models.response.error_body;

import com.google.gson.annotations.SerializedName;

public class ErrorBody{

	@SerializedName("api:timestamp")
	private String apiTimestamp;

	@SerializedName("okButtonText")
	private String okButtonText;

	@SerializedName("api:duration")
	private String apiDuration;

	@SerializedName("api:statuscode")
	private int apiStatusCode;

	@SerializedName("title")
	private String title;

	@SerializedName("url")
	private String url;

	@SerializedName("api:message")
	private String apiMessage;

	@SerializedName("cancelButtonText")
	private Object cancelButtonText;

	public String getApiTimestamp(){
		return apiTimestamp;
	}

	public String getOkButtonText(){
		return okButtonText;
	}

	public String getApiDuration(){
		return apiDuration;
	}

	public int getApiStatusCode(){
		return apiStatusCode;
	}

	public String getTitle(){
		return title;
	}

	public String getUrl(){
		return url;
	}

	public String getApiMessage(){
		return apiMessage;
	}

	public Object getCancelButtonText(){
		return cancelButtonText;
	}
}