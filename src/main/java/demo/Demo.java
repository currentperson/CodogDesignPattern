package demo;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Demo {

    private static final String EXPENSESTATUSUPDATEDEMAIL = "费用报告状态更新提醒/ Expense report status updated notice";

    /** 序列化问题, 驼峰问题, 解释问题 */
    private String ispaper;

    private Long rate = 202l;

    private static final String PERPOSE = "123";

    public static void main(String[] args) {
        // 魔法值问题
        String purpose = "报销款_" + args[0] + "_" + args[1];
        System.out.println(purpose.equals(new Demo().PERPOSE));
        ArrayList<BigDecimal> bigDecimalList = new ArrayList<>();
        bigDecimalList.add(new BigDecimal(23.567));
        for (BigDecimal bigDecimal : bigDecimalList) {
            bigDecimalList.remove(bigDecimal);
        }
    }

}
