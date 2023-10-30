package com.xubo.snailsrocket;

/**
 * @Author xubo
 * @Date 2023/10/30 11:28
 * @Description：懒汉模式（线程不安全）
 * @Version 1.0
 */
public class Singleton_01 {

    private static Singleton_01 instance;

    private Singleton_01() {
    }

    public static Singleton_01 getInstance(){
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }
}
