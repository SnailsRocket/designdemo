package com.xubo.snailsrocket.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @Author xubo
 * @Date 2023/10/16 13:34
 * @Description：
 * @Version 1.0
 */
public class JDKProxy {

    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new JDKInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();
        T t = null;
        try {
            t = (T) Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
        } catch (Exception e) {
            System.out.println("e = " + e);
            e.printStackTrace();
        }
        return t;
    }
}
