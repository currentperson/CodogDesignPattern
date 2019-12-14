package state;

public class NeedAddWeChatState extends AbstractPUAGirlState {

    public NeedAddWeChatState(PUAGirl puaGirl) {
        super(puaGirl);
    }

    @Override
    public void accosted(String talkMessage) {

    }

    @Override
    public void addWeChat(String moments) {
        if ("朋友圈前十条都是跑车, 豪宅, 巴黎铁搭, 伦敦大本钟".equals(moments)) {
            System.out.println("说不定家里还有 拆 字, 等约会吧");
            this.puaGirl.setAbstractPUAGirlState(new WaitDateState(this.puaGirl));
        } else {
            System.out.println("全是沙雕表情包, 还都是周日发的, 一看就是屌丝上班狗, 不加了");
        }
    }

    @Override
    public void date(String talkMessage) {
        System.out.println("没加微信约会没话题聊, 不约不约");
    }

    @Override
    public void makeLove() {

    }
}
