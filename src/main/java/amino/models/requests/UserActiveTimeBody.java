package amino.models.requests;

import amino.utils.TimeUtils;

import java.util.List;

public class UserActiveTimeBody {
    private int timezone;
    private int optInAdsFlags;
    private List<UserActiveTimeChunkListItem> userActiveTimeChunkList;
    private Integer timestamp = TimeUtils.unixInstant();

    public UserActiveTimeBody timezone(int timezone) {
        this.timezone = timezone;
        return this;
    }

    public UserActiveTimeBody optInAdsFlags(int optInAdsFlags) {
        this.optInAdsFlags = optInAdsFlags;
        return this;
    }

    public UserActiveTimeBody userActiveTimeChunkList(List<UserActiveTimeChunkListItem> userActiveTimeChunkList) {
        this.userActiveTimeChunkList = userActiveTimeChunkList;
        return this;
    }
}

