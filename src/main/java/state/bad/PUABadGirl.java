package state.bad;

import state.enums.GetLongStateEnum;

import static state.enums.GetLongStateEnum.FEEL_SORRY;
import static state.enums.GetLongStateEnum.MAKE_LOVE;
import static state.enums.GetLongStateEnum.NOT_KNOWN_EACH_OTHER;
import static state.enums.GetLongStateEnum.NEED_ADD_WE_CHAT;
import static state.enums.GetLongStateEnum.WAIT_DATE;

public class PUABadGirl {

    private GetLongStateEnum state = NOT_KNOWN_EACH_OTHER;

    //搭讪
    public void accosted(String talkMessage) {
        if (state == NOT_KNOWN_EACH_OTHER) {
            if ("你看起来很高冷, 其实认识了就话很多".equals(talkMessage)) {
                System.out.println("你懂我, 加个微信吧");
                state = NEED_ADD_WE_CHAT;
            } else {
                System.out.println("微信就是我手机号: 110");
            }
            return;
        }

        if (state == MAKE_LOVE) {
            System.out.println("都学完英语了还搭讪, 肾虚影响记忆力了吧");
            return;
        }
    }

    //加微信
    public void addWeChat(String moments) {
        if (state == NOT_KNOWN_EACH_OTHER) {
            System.out.println("都不认识上来就加微信, 不加, '学英语' 还得前戏呢");
            return;
        }

        if (state == NEED_ADD_WE_CHAT) {
            if ("朋友圈前十条都是跑车, 豪宅, 巴黎铁搭, 伦敦大本钟".equals(moments)) {
                System.out.println("说不定家里还有 拆 字, 等约会吧");
                state = WAIT_DATE;
            } else {
                System.out.println("全是沙雕表情包, 还都是周日发的, 一看就是屌丝上班狗, 不加了");
            }
            return;
        }

        if (state == FEEL_SORRY) {
            System.out.println("昨天还是你和我说亲戚死了要去参加, 今天咋就在这加微信");
            return;
        }

        if (state == MAKE_LOVE) {
            System.out.println("都学完英语了才加微信, 要给我微信转钱么");
            return;
        }
    }

    //约会
    public void date(String talkMessage) {
        if (state == NOT_KNOWN_EACH_OTHER) {
            System.out.println("都不认识上来就要约会, 叔叔我们不约不约");
            return;
        }

        if (state == NEED_ADD_WE_CHAT) {
            System.out.println("没加微信约会没话题聊, 不约不约");
            return;
        }

        if (state == WAIT_DATE) {
            if ("我们亲戚最近去世了, 我是他养大的".equals(talkMessage)) {
                state = FEEL_SORRY;
            } else {
                System.out.println("连美国好声音的选手都知道唱歌完比惨, 你不惨不高不帅也没有钱这个肯定单身");
            }
            return;
        }

        if (state == MAKE_LOVE) {
            System.out.println("都学完英语了还约会, 这不是 PUA, 这是暖男");
        }
    }

    //学英语
    public void makeLove() {
        if (state == NOT_KNOWN_EACH_OTHER) {
            System.out.println("不认识就要学英语!!!");
            return;
        }

        if (state == FEEL_SORRY) {
            System.out.println("他好可怜, 我要和他生猴子");
            state = MAKE_LOVE;
            return;
        }

        if (state == MAKE_LOVE) {
            System.out.println("学完英语还要学, 你真是个好学的好伙子");
            return;
        }
    }
}
