package producer_consumer.better;

public interface ItemHander<T> {
    void handle(EventItem<T> eventItem);
}
