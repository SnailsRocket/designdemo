package com.xubo.snailsrocket;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author xubo
 * @Date 2023/10/26 16:47
 * @Description：通过type 执行指定对应的逻辑
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_DecorationPackageController(){
        DecorationPackageController decoration = new DecorationPackageController();

        // 豪华欧式
        System.out.println(decoration.getMatterList(new BigDecimal("132.52"),1));

        // 轻奢田园
        System.out.println(decoration.getMatterList(new BigDecimal("98.25"),2));

        // 现代简约
        System.out.println(decoration.getMatterList(new BigDecimal("85.43"),3));
    }
}
