package visitor;

import java.util.Random;

public class SalesmanVisitor implements RealTimeEmployeeVisitor {
    @Override
    public Integer visit(Employee salesman, Void param) {
        if (salesman instanceof Salesman) {
            return salesman.getWorkingHours() + new Random().nextInt(8);
        }
        return 0;
    }
}
