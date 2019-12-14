package state;

public class WaitDateState extends AbstractPUAGirlState {

    public WaitDateState(PUAGirl puaGirl) {
        super(puaGirl);
    }

    @Override
    public void accosted(String talkMessage) {

    }

    @Override
    public void addWeChat(String moments) {

    }

    @Override
    public void date(String talkMessage) {
        if ("我们亲戚最近去世了, 我是他养大的".equals(talkMessage)) {
            this.puaGirl.setAbstractPUAGirlState(new FeelSorryState(this.puaGirl));
        } else {
            System.out.println("连美国好声音的选手都知道唱歌完比惨, 你不惨不高不帅也没有钱这个肯定单身");
        }
    }

    @Override
    public void makeLove() {

    }
}
