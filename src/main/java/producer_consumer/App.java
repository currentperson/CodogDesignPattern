package producer_consumer;

import org.apache.commons.lang3.time.StopWatch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class App {


    public static void main(String[] args) {
        StopWatch stopwatch = StopWatch.createStarted();
        final Map<Consumer, List<Good>> DELIVERY_INFO_MAP = new HashMap<>();
        DELIVERY_INFO_MAP.put(new Consumer("杰克马"), Arrays.asList(new Good("螃蟹"), new Good("河马")));
        DELIVERY_INFO_MAP.put(new Consumer("奶茶妹妹"), Arrays.asList(new Good("奶茶")));
        DELIVERY_INFO_MAP.put(new Consumer("小马哥"), Arrays.asList(new Good("肌肉")));
        Courier courier = new Courier("脸盲东");
        DELIVERY_INFO_MAP.forEach((k,v) -> {
            courier.sendGood(k,v);
        });
        stopwatch.stop();
        System.out.println("total time: " + stopwatch.getTime(TimeUnit.SECONDS));
    }
}
