package visitor;

public class CoderVisitor implements RealTimeEmployeeVisitor {

    @Override
    public Integer visit(Employee coder, Void param) {
        if (coder instanceof Coder) {
            return coder.getWorkingHours() + ((Coder) coder).getOvertimeHours();
        }
        return 0;
    }
}
