package null_object;

/**
 * 我自己
 */
public class Me extends Man {

    @Override
    public AbstractGirlFriend queryGirlFriend() {
        return NullGrilFriend.getInstance();
    }
}
