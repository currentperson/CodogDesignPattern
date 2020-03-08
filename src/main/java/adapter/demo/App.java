package adapter.demo;

public class App {

    public static void main(String[] args) {
        Horse horse = new HourseAdapter(new MyDeer());
        horse.eat();
        horse.run();
        horse.sleep();
    }
}
