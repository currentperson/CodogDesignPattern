package state;

public class FeelSorryState extends AbstractPUAGirlState {

    public FeelSorryState(PUAGirl puaGirl) {
        super(puaGirl);
    }

    @Override
    public void accosted(String talkMessage) {

    }

    @Override
    public void addWeChat(String moments) {
        System.out.println("昨天还是你和我说亲戚死了要去参加, 今天咋就在这加微信");
    }

    @Override
    public void date(String talkMessage) {

    }

    @Override
    public void makeLove() {
        System.out.println("他好可怜, 我要和他生猴子");
    }
}
