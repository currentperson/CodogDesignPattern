package dirty_flag;

import java.util.Random;

public class EmployeeWebService {

    public static Integer queryEmployeeAge(String userId) {
        return Integer.valueOf(userId);
    }

    public static void changeEmploy(String userId) {
        Constant.IS_EMPLOYEE_CHANGED = true;
    }
}
