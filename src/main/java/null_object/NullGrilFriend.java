package null_object;

/**
 * 空女朋友
 */
public final class NullGrilFriend extends AbstractGirlFriend implements PlayWithGirlFriend {

    private static final NullGrilFriend NULL_GRIL_FRIEND = new NullGrilFriend();

    private NullGrilFriend() {
    }

    public static NullGrilFriend getInstance() {
        return NULL_GRIL_FRIEND;
    }

    @Override
    protected String queryName() {
        return "五指姑娘";
    }

    @Override
    protected int queryAge() {
        //没出生呢
        return 0;
    }

    @Override
    protected Character queryCup() {
        // A 也找不着呀, 所以不能乱说, 需要减 1
        return 'A' - 1;
    }

    @Override
    protected boolean isFemale() {
        //这个是 IDEA 自动生成的代码
        return false;
    }

    @Override
    public void date() {
        System.out.println("打开电脑 D 盘下面的 '学习视频' 目录下的波老师教学");
    }

    @Override
    public void shopping() {
        System.out.println("买些女装自己穿, 买到让淘宝广告以为我是暖男");
    }

    @Override
    public void mkLove() {
        System.out.println("哎, 手上的茧");
    }
}
