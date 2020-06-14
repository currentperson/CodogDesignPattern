package caching;

import lombok.SneakyThrows;

/**
 * @author : wangwenhan
 * @since : 2020/6/14
 */
public class UserService {

    @SneakyThrows
    public static String queryUserName(String userId) {
        Thread.sleep(1000);
        return "codog代码狗";
    }
}
