package chain.demo;


public class DecideFather {

    public static String findFatherName(BigHeadSon son) {
        if (son.isPointedNose()) {
            return "尖鼻子厨师";
        }
        if (son.isCoarseEyebrows()) {
            return "粗眉毛保安";
        }
        if (son.isBigHead()) {
            return "隔壁老王";
        }
        return "小头爸爸";
    }
}
