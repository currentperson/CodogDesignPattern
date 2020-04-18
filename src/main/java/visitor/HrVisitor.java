package visitor;

public class HrVisitor implements RealTimeEmployeeVisitor {
    @Override
    public Integer visit(Employee hr, Void param) {
        if (hr instanceof Hr) {
            return hr.getWorkingHours() + ((Hr) hr).getResumeCount() * 2;
        }
        return 0;
    }
}
