package com.xubo.snailsrocket;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;

/**
 * @Author xubo
 * @Date 2023/10/26 19:46
 * @Description：
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_clone() throws CloneNotSupportedException {
        ArrayList<String> l01 = new ArrayList<String>();
        l01.add("xxx");
        l01.add("yyy");

        // 使用了object 的clone() 方法
        ArrayList<String> l02 = (ArrayList<String>) l01.clone();
        l02.add("zzz");

        System.out.println(JSON.toJSONString(l01));
        System.out.println(JSON.toJSONString(l02));

        l01.remove("xxx");

        System.out.println(JSON.toJSONString(l01));
        System.out.println(JSON.toJSONString(l02));
    }
}
