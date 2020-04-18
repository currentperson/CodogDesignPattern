package visitor;

import java.math.BigDecimal;

public class Salesman extends Employee {
    public Salesman(Integer workingHours, BigDecimal salary) {
        this.workingHours = workingHours;
        this.salary = salary;
    }
}
