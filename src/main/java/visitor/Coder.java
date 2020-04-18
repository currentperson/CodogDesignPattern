package visitor;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Coder extends Employee {
    //加班时长
    private Integer overtimeHours;

    public Coder(Integer workingHours, BigDecimal salary, Integer overtimeHours) {
        this.workingHours = workingHours;
        this.salary = salary;
        this.overtimeHours = overtimeHours;
    }
}
