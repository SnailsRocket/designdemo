package com.xubo.snailsrocket;

import com.xubo.snailsrocket.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @Author xubo
 * @Date 2023/10/16 11:08
 * @Description：
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "小傅哥", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);
    }
}
