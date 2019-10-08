package null_object;

/**
 * 正常的女朋友
 */
public class NormalGrilFriend extends AbstractGirlFriend implements PlayWithGirlFriend {

    @Override
    protected String queryName() {
        return "兰兰";
    }

    @Override
    protected int queryAge() {
        return 18;
    }

    @Override
    protected Character queryCup() {
        //嗯, 经过我阅片 20 年的经验, 这个类也是 A, 你没有看错
        return 'A';
    }

    @Override
    protected boolean isFemale() {
        return true;
    }

    @Override
    public void date() {
        System.out.println("吃饭, 看电影, 游乐园, 小树林");
    }

    @Override
    public void shopping() {
        System.out.println("买买买, 刷刷刷");
    }

    @Override
    public void mkLove() {
        System.out.println("嗯, 这个方法我也不知道要干啥, 请女读者(男的也行)联系我现场教学, 微信是 13820802870");
    }
}
