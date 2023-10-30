package com.xubo.snailsrocket;

/**
 * @Author xubo
 * @Date 2023/10/30 13:24
 * @Description：双重锁校验-线程安全
 * @Version 1.0
 */
public class Singleton_05 {
    private static volatile Singleton_05 instance;

    private Singleton_05() {
    }

    public static Singleton_05 getInstance() {
        if(null != instance) return instance;
        synchronized (Singleton_05.class) {
            if(null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
