package dependency_injection;

public class App {

    public static void main(String[] args) {
        People lanlan = new People();
        lanlan.setName("兰兰");
        lanlan.setMother(new BagMother());
        lanlan.callMother();
    }
}
