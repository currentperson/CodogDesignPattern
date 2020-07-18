package proxy;

import java.util.Objects;

/**
 * @author : wangwenhan
 * @since : 2020/7/18
 */
public class ProxyOwner implements Owner {
    private Owner myFather = new RealOwner();

    @Override
    public String writePaper(String condition) {
        if (Objects.equals("云南小学生大赛", "")) {
            return myFather.writePaper(condition);
        }
        return "不好意思, 不是小学生比赛不参加";
    }
}
