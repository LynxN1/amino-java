package amino.models.requests;

import amino.utils.TimeUtils;
import com.google.gson.annotations.SerializedName;

public class PlayLotteryBody {
    @SerializedName("timezone")
    private String timezone = "120";

    @SerializedName("timestamp")
    private Long timestamp = TimeUtils.unixInstant();
}

