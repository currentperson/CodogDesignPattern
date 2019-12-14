package mark_interface;

import lombok.Data;
import value_object.Money;

@Data
public class Employee {

    private String name;

    private Integer level;

    private Money bonus;

    private Money wages;
}
