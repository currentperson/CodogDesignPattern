package throttling.better;

import throttling.RemoteService;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class WuyiRemoteService implements RemoteService {

    public static final Map<String, Throttler> CLIENT_THROTTLER_MAP = new ConcurrentHashMap<>();
    static {
        CLIENT_THROTTLER_MAP.put("GUOQING",new ThrottlerImpl());
        CLIENT_THROTTLER_MAP.put("OTHERS",new ThrottlerImpl());
    }

    @Override
    public void takeOfficialSeal(String clientName) {
        if (!CLIENT_THROTTLER_MAP.get(clientName).canAccessReource(clientName)) {
            return;
        }
        System.out.println(clientName + "成功抢夺一枚公章" + new Random().nextInt());
    }
}
