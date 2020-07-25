package strangler;

/**
 * @author : wangwenhan
 * @since : 2020/7/25
 */
public class App {

    public static void main(String[] args) {
        Man man = new HalfMan(new OldMan(),new NewMan());
        man.sleep();
    }
}
