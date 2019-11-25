package value_object;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Money cny0 = new Money(new BigDecimal("100"), "CNY");
        Money cny1 = new Money(new BigDecimal("100"), "CNY");
        System.out.println(cny0.equals(cny1));
    }
}
