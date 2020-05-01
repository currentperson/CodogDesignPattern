package throttling;

import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class DangDangRemoteService implements RemoteService {
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

    public DangDangRemoteService() {
        new Timer(true).schedule(new TimerTask() {
            @Override
            public void run() {
                ACTUAL_CLIENT_COUNT_PER_SECOND.put("GUOQING", new AtomicInteger(0));
                ACTUAL_CLIENT_COUNT_PER_SECOND.put("OTHERS", new AtomicInteger(0));
            }
        }, 0, 1000);
    }

    @Override
    public void takeOfficialSeal(String clientName) {
        if (ACTUAL_CLIENT_COUNT_PER_SECOND.get(clientName).getAndIncrement()
        >= ALLOW_CLIENT_COUNT_PER_SECOND.get(clientName).get()) {
            return;
        }
        System.out.println(clientName + "成功抢夺一枚公章" + new Random().nextInt());
    }
}
