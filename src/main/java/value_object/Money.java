package value_object;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public class Money {

    private BigDecimal amount;
    //enum is better
    private String currency;
}
