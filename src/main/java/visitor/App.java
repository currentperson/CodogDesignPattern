package visitor;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class App {

    public static final List<Employee> EMPLOYEE_LIST = Arrays.asList(
            new Coder(8, new BigDecimal(100), 8), new Coder(8, new BigDecimal(100), 12),
            new Salesman(8, new BigDecimal(100)), new Salesman(8, new BigDecimal(100)),
            new Hr(8, new BigDecimal(100),3), new Hr(8, new BigDecimal(100),5));

    public static void main(String[] args) {
        Integer totalWorkHours = 0;
        for (Employee employee : EMPLOYEE_LIST) {
            if (employee instanceof Coder) {
                totalWorkHours += employee.getWorkingHours() + ((Coder) employee).getOvertimeHours();
            }
            if (employee instanceof Hr) {
                totalWorkHours += employee.getWorkingHours() + ((Hr) employee).getResumeCount()*2;
            }
            totalWorkHours += employee.getWorkingHours() + new Random().nextInt(8);
        }
        System.out.println("总时长: " + totalWorkHours);
    }

    public static Integer calRealTime(Employee employee) {
        if (employee instanceof Coder) {
            return employee.getWorkingHours() * 2;
        }
        if (employee instanceof Hr) {
            return employee.getWorkingHours();
        }
        return employee.getWorkingHours() + 2;
    }

    public static Integer calReportTime(Employee employee) {
        if (employee instanceof Coder) {
            return employee.getWorkingHours() / 2;
        }
        if (employee instanceof Hr) {
            return employee.getWorkingHours();
        }
        return employee.getWorkingHours() - 2;
    }
}
