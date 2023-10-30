package com.xubo.snailsrocket;

import org.junit.Test;

/**
 * @Author xubo
 * @Date 2023/10/30 13:52
 * @Description 枚举单例-线程安全
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test() {
        Singleton_07.INSTANCE.test();
    }
}
