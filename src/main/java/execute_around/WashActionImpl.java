package execute_around;

public class WashActionImpl implements WashAction {
    @Override
    public void wasHands(String name) {
        System.out.println(name + "随便用手冲冲");
    }
}
