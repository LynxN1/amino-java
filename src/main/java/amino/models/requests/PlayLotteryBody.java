package amino.models.requests;

import amino.utils.TimeUtils;

public class PlayLotteryBody {
    private String timezone = "120";
    private Integer timestamp = TimeUtils.unixInstant();
}
