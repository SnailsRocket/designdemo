package com.xubo.snailsrocket;

import org.junit.Test;

/**
 * @Author xubo
 * @Date 2023/10/26 17:08
 * @Description：使用构造者模式实现 实际场景像创建订单就可以使用建造者模式，将一些流程拆分成一个个的工序，然后将他们组装起来。eg：创建订单、计算优惠金额、计算价格、扣减库存、获取收货人信息
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_Builder(){
        Builder builder = new Builder();

        // 豪华欧式
        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
