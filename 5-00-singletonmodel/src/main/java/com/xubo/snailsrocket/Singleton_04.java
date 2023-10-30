package com.xubo.snailsrocket;

/**
 * @Author xubo
 * @Date 2023/10/30 13:21
 * @Description：使用类的内部类-线程安全
 * @Version 1.0
 */
public class Singleton_04 {
    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {

    }
    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
