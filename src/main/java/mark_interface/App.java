package mark_interface;

import builder.enums.CupEnum;

public class App {

    public static void main(String[] args) throws IllegalAccessException {
        LoggerUtil.printWithoutCupInfo(new Girl("兰兰",new Cup(CupEnum.A,60)));
    }
}
