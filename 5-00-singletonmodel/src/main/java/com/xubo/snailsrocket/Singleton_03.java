package com.xubo.snailsrocket;

/**
 * @Author xubo
 * @Date 2023/10/30 13:17
 * @Description：单例模式-饿汉 线程安全
 * @Version 1.0
 */
public class Singleton_03 {
    private static Singleton_03 instance = new Singleton_03();
    private Singleton_03() {

    }
    public static Singleton_03 getInstance() {
        return instance;
    }
}
