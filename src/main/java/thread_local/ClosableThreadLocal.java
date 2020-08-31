package thread_local;

/**
 * @author : wangwenhan
 * @since : 2020/8/30
 */
public class ClosableThreadLocal<T> implements AutoCloseable {
    private final ThreadLocal<T> THREAD_LOCAL;

    public ClosableThreadLocal(ThreadLocal<T> threadLocal) {
        THREAD_LOCAL = threadLocal;
    }

    @Override
    public void close() throws Exception {
        THREAD_LOCAL.remove();
    }

    public void set(T t) {
        THREAD_LOCAL.set(t);
    }

    public T get() {
        return THREAD_LOCAL.get();
    }
}
