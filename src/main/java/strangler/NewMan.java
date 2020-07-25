package strangler;

/**
 * @author : wangwenhan
 * @since : 2020/7/25
 */
public class NewMan implements Man {
    @Override
    public void eat() {
        System.out.println("爱吃西湖醋鱼");
    }

    @Override
    public void drink() {
        System.out.println("爱喝啤酒");
    }

    @Override
    public void sleep() {
        throw new RuntimeException("还没实现, 请调用老接口");
    }
}
