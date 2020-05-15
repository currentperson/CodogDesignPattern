package producer_consumer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
//快递员
public class Courier {
    private String name;

    public void sendGood(Consumer consumer, List<Good> goodList) {
        consumer.receiveGood(goodList);
    }
}
