package producer_consumer.better;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventItem<T> {

    private EventItemType eventType;

    private String eventId;

    private LocalDateTime eventDateTime;

    private T eventValue;
}
