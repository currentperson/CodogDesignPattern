package caching;

/**
 * @author : wangwenhan
 * @since : 2020/6/14
 */
public abstract class AbstractQueryAction<T, R> implements QueryAction<T, R> {

    @Override
    public T queryFromCache(String key) {
        return (T) App.CACHE_MAP.get(key);
    }

    @Override
    public void putToCache(String key, T t) {
        App.CACHE_MAP.put(key, t);
    }
}
