package semaphore;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

//摆摊人
@Data
@AllArgsConstructor
public class People {
    private String name;
    private List<Goods> saleGoods;
}
