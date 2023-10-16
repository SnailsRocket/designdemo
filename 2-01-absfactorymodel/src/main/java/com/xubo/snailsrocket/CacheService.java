package com.xubo.snailsrocket;

import java.util.concurrent.TimeUnit;

/**
 * @Author xubo
 * @Date 2023/10/16 11:05
 * @Description：
 * @Version 1.0
 */
public interface CacheService {

    String get(final String key, int redisType);

    void set(String key, String value, int redisType);

    void set(String key, String value, long timeout, TimeUnit timeUnit, int redisType);

    void del(String key, int redisType);
}
