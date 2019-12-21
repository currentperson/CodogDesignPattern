package prototype;

public class BeanUtil {

    public static <T> T deepClone(T source, Class<T> tClass) {
        return GsonUtil.convert(GsonUtil.toJson(source), tClass);
    }
}
