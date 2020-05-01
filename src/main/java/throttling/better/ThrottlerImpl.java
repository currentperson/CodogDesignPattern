package throttling.better;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ThrottlerImpl implements Throttler {

    public static final Map<String, AtomicInteger> ALLOW_CLIENT_COUNT_PER_SECOND = new ConcurrentHashMap<>();

    static {
        ALLOW_CLIENT_COUNT_PER_SECOND.put("GUOQING", new AtomicInteger(0));
        ALLOW_CLIENT_COUNT_PER_SECOND.put("OTHERS", new AtomicInteger(2));
    }

    public static final Map<String, AtomicInteger> ACTUAL_CLIENT_COUNT_PER_SECOND = new ConcurrentHashMap<>();

    static {
        ACTUAL_CLIENT_COUNT_PER_SECOND.put("GUOQING", new AtomicInteger(0));
        ACTUAL_CLIENT_COUNT_PER_SECOND.put("OTHERS", new AtomicInteger(0));
    }

    public ThrottlerImpl() {
        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
                ACTUAL_CLIENT_COUNT_PER_SECOND.put("GUOQING", new AtomicInteger(0));
                ACTUAL_CLIENT_COUNT_PER_SECOND.put("OTHERS", new AtomicInteger(0));
            }
        }, 0, 1000);
    }

    @Override
    public int getAllowedClientCount(String clientName) {
        return ALLOW_CLIENT_COUNT_PER_SECOND.get(clientName).get();
    }

    @Override
    public int getActualClientCount(String clientName) {
        return ACTUAL_CLIENT_COUNT_PER_SECOND.get(clientName).getAndIncrement();
    }
}
