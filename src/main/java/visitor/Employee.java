package visitor;

import lombok.Data;

import java.math.BigDecimal;

@Data
public abstract class Employee implements Element<Integer,Integer> {
    //默认工作时长,比如 8 小时
    protected Integer workingHours;
    //每小时薪水
    protected BigDecimal salary;

    @Override
    public Integer accept(ElementVisitor<Integer, Element, Integer> v, Integer param) {
        return v.visit(this, param);
    }
}
