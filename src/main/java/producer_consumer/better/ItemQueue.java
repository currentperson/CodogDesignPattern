package producer_consumer.better;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ItemQueue {

    private BlockingQueue<EventItem> queue = new LinkedBlockingQueue<>(50);

    public void put(EventItem item) {
        try {
            queue.put(item);
        } catch (InterruptedException e) {
            throw new RuntimeException("put item to queue failed");
        }
    }

    public EventItem take() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException("put item to queue failed");
        }
    }
}
