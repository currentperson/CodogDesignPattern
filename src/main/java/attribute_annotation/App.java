package attribute_annotation;

import java.lang.reflect.Field;

/**
 * @author : wangwenhan
 * @since : 2020/8/2
 */
public class App {
    public static void main(String[] args) throws IllegalAccessException {
        Enterprise enterprise =
            new Enterprise("微软",
                "Windows代码库");
        JkGirl jkGirl =
            new JkGirl("jkGirl",
                        "白色上衣",
                     "黑色安全裤");
        printLeakageInfoByAnnotation(enterprise);
        printLeakageInfoByAnnotation(jkGirl);
    }

    public static void printLeakageInfo(Object object) {
        if(object instanceof Enterprise) {
            System.out.println(
                "泄露了" + ((Enterprise)object)
                    .getCodeHubName());
        }
        else if(object instanceof JkGirl) {
            System.out.println(
                "泄露了" + ((JkGirl)object)
                    .getAnquanku());
        }
    }

    public static void printLeakageInfoByAnnotation(Object object) throws IllegalAccessException {
        Field[] declaredFields = object.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            if(!declaredField.isAnnotationPresent(Leakage.class)) {
                continue;
            }
            declaredField.setAccessible(true);
            System.out.println("泄露了" + declaredField.get(object));
        }
    }
}
