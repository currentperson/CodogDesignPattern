package mark_interface;

import java.lang.reflect.Field;

public class LoggerUtil {

    public static void printWithoutCupInfo(Object object) throws IllegalAccessException {
        for (Field field : object.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            Object filedValue = field.get(object);
            if (filedValue instanceof NotPrint) {
                continue;
            }
            System.out.println(field.getName() + ":" + filedValue);
        }
    }
}
