package proxy;

/**
 * @author : wangwenhan
 * @since : 2020/7/18
 */
public class App {

    public static void main(String[] args) {
        Owner owner = new ProxyOwner();
        System.out.println(owner.writePaper("博士大赛"));
    }
}
