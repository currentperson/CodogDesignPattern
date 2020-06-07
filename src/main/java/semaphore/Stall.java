package semaphore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//摊位
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stall {
    private Integer number;
    private String name;
    private List<Goods> saleGoods;
}
