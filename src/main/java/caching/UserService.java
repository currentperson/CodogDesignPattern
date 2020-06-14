package caching;

import lombok.SneakyThrows;

import java.util.Objects;

/**
 * @author : wangwenhan
 * @since : 2020/6/14
 */
public class UserService {

    @SneakyThrows
    public static String queryUserName(String userId) {
        Thread.sleep(1000);
        if(Objects.equals("1",userId)) {
            return "黄圣依";
        }
        if(Objects.equals("2",userId)) {
            return "伊能静";
        }
        if(Objects.equals("3",userId)) {
            return "张雨绮";
        }
        if(Objects.equals("4",userId)) {
            return "宁静";
        }
        return "codog代码狗";
    }
}
