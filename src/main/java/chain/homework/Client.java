package chain.homework;

public class Client {

    //是否不在黑名单
    public static boolean isNotInBlack(String userId) {
        return true;
    }

    //是否是实名认证用户
    public static boolean isRealUser(String userId) {
        return true;
    }

    //是否产品可用
    public static boolean isPdUsable(String pdCode) {
        return true;
    }

    //是否用户额度充足
    public static boolean isHasSoMuchMoney(String userId, String loanAmt) {
        return false;
    }
}
