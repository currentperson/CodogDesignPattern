package strangler;

/**
 * @author : wangwenhan
 * @since : 2020/7/25
 */
public class HalfMan implements Man {

    private Man oldMan;

    private NewMan newMan;

    public HalfMan(Man oldMan, NewMan newMan) {
        this.oldMan = oldMan;
        this.newMan = newMan;
    }

    @Override
    public void eat() {
        newMan.eat();
    }

    @Override
    public void drink() {
        newMan.drink();
    }

    @Override
    public void sleep() {
        oldMan.sleep();
    }
}
