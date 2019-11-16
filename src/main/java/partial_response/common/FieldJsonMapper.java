package partial_response.common;

import java.lang.reflect.Field;

public class FieldJsonMapper {

    public static <T> String toJson(T t, String[] fields, Class<T> tClass) throws Exception {
        StringBuilder json = new StringBuilder().append("{");

        for (int i = 0, fieldsLength = fields.length; i < fieldsLength; i++) {
            json.append(getString(t, tClass.getDeclaredField(fields[i])));
            if (i != fieldsLength - 1) {
                json.append(",");
            }
        }
        json.append("}");
        return json.toString();
    }

    private static <T> String getString(T t, Field declaredField) throws IllegalAccessException {
        declaredField.setAccessible(true);
        Object value = declaredField.get(t);
        if (declaredField.get(t) instanceof Integer) {
            return "\"" + declaredField.getName() + "\"" + ": " + value;
        }
        return "\"" + declaredField.getName() + "\"" + ": " + "\"" + value.toString() + "\"";
    }
}
