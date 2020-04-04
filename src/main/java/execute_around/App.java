package execute_around;

public class App {

    public static void main(String[] args) {
        People people = new Codog();
        people.wasHands();
        people = new Lanlan();
        people.wasHands();
        WashTemplate.doWashing("兰兰", (name) -> System.out.println(name + "随便冲冲"));
    }
}
