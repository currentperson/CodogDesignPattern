package producer_consumer.better;

import java.time.LocalDateTime;
import java.util.UUID;

public class ItemProducer {

    private ItemQueue itemQueue;

    public ItemProducer(ItemQueue itemQueue) {
        this.itemQueue = itemQueue;
    }

    public <T> void generateEvent(EventItemType eventItemType, T value) {
        EventItem<T> eventItem = new EventItem<>();
        eventItem.setEventDateTime(LocalDateTime.now());
        eventItem.setEventId(UUID.randomUUID().toString());
        eventItem.setEventValue(value);
        eventItem.setEventType(eventItemType);
        itemQueue.put(eventItem);
    }
}
