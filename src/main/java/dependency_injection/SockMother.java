package dependency_injection;

public class SockMother implements Mother {

    @Override
    public String findThing() {
        return "找到袜子";
    }
}
