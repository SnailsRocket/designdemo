package com.xubo.snailsrocket.factory;

import java.util.concurrent.TimeUnit;

/**
 * @Author xubo
 * @Date 2023/10/16 13:42
 * @Description：缓存接口，对外暴露
 * @Version 1.0
 */
public interface ICacheAdapter {
    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);
}
