package visitor;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Hr extends Employee {
    private Integer resumeCount;

    public Hr(Integer workingHours, BigDecimal salary, Integer resumeCount) {
        this.workingHours = workingHours;
        this.salary = salary;
        this.resumeCount = resumeCount;
    }
}
