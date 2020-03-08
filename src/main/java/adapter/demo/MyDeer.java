package adapter.demo;

public class MyDeer implements Deer {
    @Override
    public void eat() {
        System.out.println("吃草");
    }

    @Override
    public void walk() {
        System.out.println("走路, 遇到紧急情况冲刺");
    }

    @Override
    public void sleep() {
        System.out.println("睡觉");
    }
}
