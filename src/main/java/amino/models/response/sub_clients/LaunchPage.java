package amino.models.response.sub_clients;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class LaunchPage {

  @SerializedName("mediaList")
  private List<Object> mediaList;

  @SerializedName("title")
  private String title;

  public List<Object> getMediaList() {
    return mediaList;
  }

  public String getTitle() {
    return title;
  }
}