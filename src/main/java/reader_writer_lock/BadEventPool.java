package reader_writer_lock;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author : wangwenhan
 * @since : 2020/6/19
 */
public class BadEventPool {

    public static final List<BadEvent> badEventList = new CopyOnWriteArrayList<>();

    public static String findNewBadEventPeopleName() {
        return badEventList.stream().max(Comparator.comparing(BadEvent::getHappenedTime))
            .orElse(new BadEvent()).getPeopleName();
    }

    public static String findNewBadEventName() {
        return badEventList.stream().max(Comparator.comparing(BadEvent::getHappenedTime))
            .orElse(new BadEvent()).getEventName();
    }
}
