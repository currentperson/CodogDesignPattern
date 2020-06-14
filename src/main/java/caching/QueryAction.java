package caching;

/**
 * @author : wangwenhan
 * @since : 2020/6/14
 */
public interface QueryAction<T, R> {

    T queryFromCache(String key);

    T query(R r);

    void putToCache(String key, T t);
}
