package producer_consumer.better;

import lombok.AllArgsConstructor;
import lombok.Data;
import producer_consumer.Good;

import java.util.List;

@Data
@AllArgsConstructor
public class ConsumerItemHandler implements ItemHander<List<Good>> {

    private String name;

    @Override
    public void handle(EventItem<List<Good>> eventItem) {
        System.out.println(name + "收到了" + eventItem.getEventValue().toString());
    }
}
