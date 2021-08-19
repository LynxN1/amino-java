package amino.models.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class Style {
    @SerializedName(value="backgroundColor")
    private String backgroundColor;

    public String getBackgroundColor() {
        return this.backgroundColor;
    }
}

