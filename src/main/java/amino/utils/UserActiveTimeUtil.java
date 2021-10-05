package amino.utils;

import amino.models.requests.SendActiveBody;
import amino.models.requests.UserActiveTimeChunkList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserActiveTimeUtil {
    private SendActiveBody getActiveTimeInstance(Integer optInAdsFlags) {
        SendActiveBody activeTime = new SendActiveBody();
        activeTime.setTimezone(180);
        activeTime.setOptInAdsFlags(optInAdsFlags);
        return activeTime;
    }

    public SendActiveBody genActiveTime(Boolean adv) {
        SendActiveBody activeTime;
        if (adv)
            activeTime = getActiveTimeInstance(2147483647);
        else
            activeTime = getActiveTimeInstance(0);
        var chunks = new ArrayList<UserActiveTimeChunkList>();
        int periods = new Random().nextInt(5);
        long min = System.currentTimeMillis() / 1000L - 300L;
        int dex = 10;
        List<Long> gaps = new ArrayList<>();
        while (gaps.size() < periods) {
            long gap = min + dex + new Random().nextInt(300 - dex);
            if (gaps.stream().filter(g -> (Math.abs(g - gap) < dex)).findAny().orElse(-1L) == -1L)
                gaps.add(gap);
        }
        long start = new Random().nextBoolean() ? (min + 1L) : (min + 1L + new Random().nextInt(dex - 1));
        for (int i = 0; i < periods; i++) {
            var chunk = new UserActiveTimeChunkList();
            chunk.setStart(start);
            chunk.setEnd(gaps.get(i));
            chunks.add(chunk);
            start = gaps.get(i) + 2L + new Random().nextInt(dex - 2);
        }
        var chunk = new UserActiveTimeChunkList();
        chunk.setStart(start);
        chunk.setEnd(new Random().nextBoolean() ? (min + 299L) : (min + 299L - new Random().nextInt(dex)));
        chunks.add(chunk);
        activeTime.setUserActiveTimeChunkList(chunks);
        return activeTime;
    }
}
