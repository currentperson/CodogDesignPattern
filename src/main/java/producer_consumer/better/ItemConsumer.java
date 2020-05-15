package producer_consumer.better;


import java.util.EnumMap;

public class ItemConsumer {

    private ItemQueue itemQueue;
    private EnumMap<EventItemType, ItemHander> typeItemHander;

    public ItemConsumer(ItemQueue itemQueue, EnumMap<EventItemType, ItemHander> typeItemHander) {
        this.itemQueue = itemQueue;
        this.typeItemHander = typeItemHander;
    }

    public void handleEvent() {
        EventItem eventItem = itemQueue.take();
        typeItemHander.get(eventItem.getEventType()).handle(eventItem);
    }
}
