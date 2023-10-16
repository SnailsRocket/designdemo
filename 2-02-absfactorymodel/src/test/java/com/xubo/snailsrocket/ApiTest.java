package com.xubo.snailsrocket;

import com.xubo.snailsrocket.factory.JDKProxy;
import com.xubo.snailsrocket.factory.impl.EGMCacheAdapter;
import com.xubo.snailsrocket.factory.impl.IIRCacheAdapter;
import com.xubo.snailsrocket.impl.CacheServiceImpl;
import org.junit.Test;

/**
 * @Author xubo
 * @Date 2023/10/16 14:00
 * @Description：
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_CacheService() throws Exception {
        CacheServiceImpl proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "Druid");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("val01 = " + val01);

        CacheServiceImpl proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_02", "snails");
        String val02 = proxy_IIR.get("user_name_02");
        System.out.println("val02 = " + val02);
    }

}
