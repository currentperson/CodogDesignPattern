package producer_consumer.better;

import org.apache.commons.lang3.time.StopWatch;
import producer_consumer.Good;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;

public class App {

    public static void main(String[] args) throws InterruptedException {
        StopWatch stopwatch = StopWatch.createStarted();
        ItemQueue itemQueue = new ItemQueue();
        new ItemProducer(itemQueue).generateEvent(EventItemType.SEND_GOOD_TO_JIEKEMA, Arrays.asList(new Good("螃蟹"), new Good("河马")));
        new ItemProducer(itemQueue).generateEvent(EventItemType.SEND_GOOD_TO_NAICHA, Arrays.asList(new Good("奶茶")));
        new ItemProducer(itemQueue).generateEvent(EventItemType.SEND_GOOD_TO_XIAOMAGE, Arrays.asList(new Good("奶茶")));

        EnumMap<EventItemType, ItemHander> typeItemHander = new EnumMap<>(EventItemType.class);
        typeItemHander.put(EventItemType.SEND_GOOD_TO_JIEKEMA,new ConsumerItemHandler("杰克马"));
        typeItemHander.put(EventItemType.SEND_GOOD_TO_NAICHA,new ConsumerItemHandler("奶茶妹妹"));
        typeItemHander.put(EventItemType.SEND_GOOD_TO_XIAOMAGE,new ConsumerItemHandler("小马哥"));
        ItemConsumer itemConsumer = new ItemConsumer(itemQueue, typeItemHander);
        new Thread(() -> {
            while (true) {
                itemConsumer.handleEvent();
            }
        }).start();
        Thread.sleep(1000);
        stopwatch.stop();
        System.out.println("total time: " + stopwatch.getTime(TimeUnit.SECONDS));
    }
}
