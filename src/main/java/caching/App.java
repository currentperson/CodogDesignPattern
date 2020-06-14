package caching;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wangwenhan
 * @since : 2020/6/14
 */
public class App {

    public static final Map<String, Object> CACHE_MAP = new HashMap<>();

    public static void main(String[] args) {
        CacheTemplate cacheTemplate = new CacheTemplate();
        System.out.println(cacheTemplate.queryByCaching(new AbstractQueryAction<String, String>() {
            @Override
            public String query(String userId) {
                return UserService.queryUserName(userId);
            }
        }, "123", "employeeid-123"));
    }
}
