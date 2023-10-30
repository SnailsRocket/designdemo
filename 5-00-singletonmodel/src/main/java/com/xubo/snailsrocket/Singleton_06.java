package com.xubo.snailsrocket;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @Author xubo
 * @Date 2023/10/30 13:26
 * @Description：CAS AtomicReference 线程安全
 * @Version 1.0
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    private static Singleton_06 instance;

    private Singleton_06() {

    }

    public static final Singleton_06 getInstance() {
        for (; ; ) {
            Singleton_06 instance = INSTANCE.get();
            if(null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println("Singleton_06.getInstance() = " + Singleton_06.getInstance());
        System.out.println("Singleton_06.getInstance() = " + Singleton_06.getInstance());
    }
}
