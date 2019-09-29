package template_method.prod;

/**
 * 弱依赖方法
 *
 * @param <T>
 * @param <R>
 */
public interface WeakFunction<T, R> {

    /**
     * 是否是业务开关打开
     * @return
     */
    default boolean isBusinessOpen() {
        return false;
    }

    /**
     * 执行弱依赖方法, 真正的业务逻辑
     *
     * @param request
     * @return
     */
    R execute(T request);
}
