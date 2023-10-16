package com.xubo.snailsrocket.cuisine.impl;

import com.xubo.snailsrocket.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Author xubo
 * @Date 2023/10/16 10:33
 * @Description：
 * @Version 1.0
 */
public class CacheServiceImpl {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
