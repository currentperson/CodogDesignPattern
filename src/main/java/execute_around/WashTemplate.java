package execute_around;

public class WashTemplate {
    public static void doWashing(String name, WashAction washAction) {
        System.out.println("打开水龙头");
        washAction.wasHands(name);
        System.out.println("关闭水龙头");
    }
}
