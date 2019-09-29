package template_method.prod;

public class WeakTemplate {

    private WeakTemplate() {
    }

    /**
     * 执行弱依赖模板
     *
     * @param weakFunction 真正的业务逻辑
     * @param request      请求入参
     * @param defaultValue 开关关了或者执行失败时候的值
     * @param tip          //报错的提示信息
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> R doWeakFunction(WeakFunction<T, R> weakFunction, T request, R defaultValue, String tip) {
        //使用卫语句
        if (!weakFunction.isBusinessOpen()) {
            return defaultValue;
        }
        try {
            return weakFunction.execute(request);
        } catch (Exception e) {
            System.out.println(tip + e.getMessage());
            return defaultValue;
        }
    }
}
