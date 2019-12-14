package state;

public class NotKnownEachOtherState extends AbstractPUAGirlState {

    public NotKnownEachOtherState(PUAGirl puaGirl) {
        super(puaGirl);
    }

    @Override
    public void accosted(String talkMessage) {
        if ("你看起来很高冷, 其实认识了就话很多".equals(talkMessage)) {
            System.out.println("你懂我, 加个微信吧");
            this.puaGirl.setAbstractPUAGirlState(new NeedAddWeChatState(this.puaGirl));
        } else {
            System.out.println("微信就是我手机号: 110");
        }
    }

    @Override
    public void addWeChat(String moments) {
        System.out.println("都不认识上来就加微信, 不加, '学英语' 还得前戏呢");
    }

    @Override
    public void date(String talkMessage) {
        System.out.println("都不认识上来就要约会, 叔叔我们不约不约");
    }

    @Override
    public void makeLove() {
        System.out.println("不认识就要学英语!!!");
    }
}
