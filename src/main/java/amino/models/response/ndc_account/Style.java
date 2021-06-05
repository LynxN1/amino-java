package amino.models.response.ndc_account;

import com.google.gson.annotations.SerializedName;

public class Style {

  @SerializedName("backgroundColor")
  private String backgroundColor;

  public String getBackgroundColor() {
    return backgroundColor;
  }
}