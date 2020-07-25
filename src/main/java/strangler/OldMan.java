package strangler;

/**
 * @author : wangwenhan
 * @since : 2020/7/25
 */
public class OldMan implements Man {
    @Override
    public void eat() {
        System.out.println("爱吃狗不理包子");
    }

    @Override
    public void drink() {
        System.out.println("爱喝白酒");
    }

    @Override
    public void sleep() {
        System.out.println("8 点睡到 8 点");
    }
}
