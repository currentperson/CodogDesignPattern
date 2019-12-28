package object_pool;

import lombok.Data;
import lombok.SneakyThrows;

@Data
public class Bicycle {

    private String colour;

    private Integer fee;

    private boolean broken;

    @SneakyThrows
    //造一辆自行车的代价
    public Bicycle(String colour, Integer fee, boolean broken) {
        Thread.sleep(1000);
        this.colour = colour;
        this.fee = fee;
        this.broken = broken;
    }
}
