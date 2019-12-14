package state;

import lombok.Data;

@Data
public class PUAGirl {

    private AbstractPUAGirlState abstractPUAGirlState = new NotKnownEachOtherState(this);

    //搭讪
    public void accosted(String message) {
        abstractPUAGirlState.accosted(message);
    }

    //加微信
    public void addWeChat(String message) {
        abstractPUAGirlState.addWeChat(message);
    }

    //约会
    public void date(String message) {
        abstractPUAGirlState.date(message);
    }

    //学英语
    public void makeLove() {
        abstractPUAGirlState.makeLove();
    }
}
