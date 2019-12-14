package state;

public abstract class AbstractPUAGirlState {

    protected PUAGirl puaGirl;

    AbstractPUAGirlState(PUAGirl puaGirl) {
        this.puaGirl = puaGirl;
    }

    //搭讪
    public abstract void accosted(String talkMessage);

    //加微信
    public abstract void addWeChat(String moments);

    //约会
    public abstract void date(String talkMessage);

    //学英语
    public abstract void makeLove();
}
