package null_object;

/**
 * 其他人
 */
public class Others extends Man {

    @Override
    public AbstractGirlFriend queryGirlFriend() {
        return new NormalGrilFriend();
    }
}
