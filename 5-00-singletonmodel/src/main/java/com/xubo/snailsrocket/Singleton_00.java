package com.xubo.snailsrocket;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author xubo
 * @Date 2023/10/30 11:27
 * @Description：静态类使用
 * @Version 1.0
 */
public class Singleton_00 {
    public static Map<String,String> cache = new ConcurrentHashMap<String, String>();
}
