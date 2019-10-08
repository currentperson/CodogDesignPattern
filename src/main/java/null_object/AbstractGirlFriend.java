package null_object;

/**
 * 女朋友属性
 */
public abstract class AbstractGirlFriend {

    /**
     * 查询姓名
     * @return
     */
    protected abstract String queryName();

    /**
     * 查询年龄
     * @return
     */
    protected abstract int queryAge();

    /**
     * 查询 cup
     * @return
     */
    protected abstract Character queryCup();

    /**
     * 是不是女性
     * @return
     */
    protected abstract boolean isFemale();
}
