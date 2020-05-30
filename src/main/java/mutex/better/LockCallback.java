package mutex.better;

/**
 * @author : wangwenhan
 * @since : 2020/5/29
 */
public interface LockCallback {

    boolean checkStatus(String uuid);

    void execute();
}
