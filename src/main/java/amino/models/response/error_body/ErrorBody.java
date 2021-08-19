package amino.models.response.error_body;

import com.google.gson.annotations.SerializedName;

public class ErrorBody {
    @SerializedName(value="api:timestamp")
    private String apiTimestamp;
    @SerializedName(value="okButtonText")
    private String okButtonText;
    @SerializedName(value="api:duration")
    private String apiDuration;
    @SerializedName(value="api:statuscode")
    private int apiStatusCode;
    @SerializedName(value="title")
    private String title;
    @SerializedName(value="url")
    private String url;
    @SerializedName(value="api:message")
    private String apiMessage;
    @SerializedName(value="cancelButtonText")
    private Object cancelButtonText;

    public String getApiTimestamp() {
        return this.apiTimestamp;
    }

    public String getOkButtonText() {
        return this.okButtonText;
    }

    public String getApiDuration() {
        return this.apiDuration;
    }

    public int getApiStatusCode() {
        return this.apiStatusCode;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String getApiMessage() {
        return this.apiMessage;
    }

    public Object getCancelButtonText() {
        return this.cancelButtonText;
    }
}

