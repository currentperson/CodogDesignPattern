package visitor;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BetterApp {

    public static final List<Employee> EMPLOYEE_LIST = Arrays.asList(
            new Coder(8, new BigDecimal(100), 8), new Coder(8, new BigDecimal(100), 12),
            new Salesman(8, new BigDecimal(100)), new Salesman(8, new BigDecimal(100)),
            new Hr(8, new BigDecimal(100),3), new Hr(8, new BigDecimal(100),5));

    public static void main(String[] args) {
        Map<Class,ElementVisitor> vistorMap = new HashMap<>();
        vistorMap.put(Coder.class,new CoderVisitor());
        vistorMap.put(Hr.class,new HrVisitor());
        vistorMap.put(Salesman.class,new SalesmanVisitor());

        Integer totalWorkHours = 0;
        for (Employee employee : EMPLOYEE_LIST) {
            totalWorkHours += employee.accept(vistorMap.get(employee.getClass()),null);
        }
        System.out.println("工作总时长: " + totalWorkHours);
    }
}
