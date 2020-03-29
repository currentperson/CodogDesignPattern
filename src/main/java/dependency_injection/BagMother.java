package dependency_injection;

public class BagMother implements Mother {

    @Override
    public String findThing() {
        return "找到书包";
    }
}
