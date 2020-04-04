package execute_around;

public class Codog implements People {

    @Override
    public void wasHands() {
        System.out.println("打开水龙头");
        System.out.println("涂洗手液洗手");
        System.out.println("关闭水龙头");
    }
}
