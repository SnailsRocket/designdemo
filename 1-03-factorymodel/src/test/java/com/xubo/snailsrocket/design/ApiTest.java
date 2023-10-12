package com.xubo.snailsrocket.design;

import com.xubo.snailsrocket.design.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/12 18:39
 * @Description：模块01在if-else里面创建对象，根据传的type创建对应的对象。模块02将创建对象的过程放在了StoreFactory中。这就是将创建对象的操作交给工厂管理。创建对象的过程可以优化，将if-else去掉。
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_commodity() throws Exception {
        StoreFactory storeFactory = new StoreFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");

        commodityService_2.sendCommodity("10001","9820198721311","1023000020112221113",new HashMap<String, String>() {{
            put("consigneeUserName", "谢飞机");
            put("consigneeUserPhone", "15200292123");
            put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");
        }});

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001","AQY1xjkUodl8LO975GdfrYUio",null,null);

    }

}
