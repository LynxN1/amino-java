package amino.models.requests;

import amino.models.requests.TippingContext;
import amino.utils.TimeUtils;

public class SendCoinsBody {
    private Integer coins;
    private TippingContext tippingContext;
    private Integer timestamp = TimeUtils.unixInstant();

    public SendCoinsBody coins(Integer coins) {
        this.coins = coins;
        return this;
    }
}

