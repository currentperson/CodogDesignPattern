package caching;

/**
 * @author : wangwenhan
 * @since : 2020/6/14
 */
public class CacheTemplate {
    public <T, R> T queryByCaching(QueryAction<T, R> queryAction, R r, String key) {
        T resultFromCahce = queryAction.queryFromCache(key);
        if (resultFromCahce != null) {
            return resultFromCahce;
        }
        T result = queryAction.query(r);
        queryAction.putToCache(key, result);
        return result;
    }
}
