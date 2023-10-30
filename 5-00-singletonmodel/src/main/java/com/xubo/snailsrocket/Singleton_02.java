package com.xubo.snailsrocket;

/**
 * @Author xubo
 * @Date 2023/10/30 11:29
 * @Description：懒汉式-线程安全
 * @Version 1.0
 */
public class Singleton_02 {
    private static Singleton_02 instance;

    private Singleton_02() {

    }

    public static synchronized Singleton_02 getInstance() {
        if(null != instance) return instance;
        instance = new Singleton_02();
        return instance;
    }
}
