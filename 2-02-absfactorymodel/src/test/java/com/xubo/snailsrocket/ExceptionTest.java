package com.xubo.snailsrocket;

import org.junit.Test;

/**
 * @Author xubo
 * @Date 2023/10/16 16:38
 * @Description：
 * @Version 1.0
 */
public class ExceptionTest {

    @Test
    public void testException() {
        try {
            throwExce();
        } catch (Exception e) {
            System.out.println("e2 = " + e);
            e.printStackTrace();
        }
    }

    private void throwExce() {
        try {
            int i = 10/0;
        } catch (Exception e) {
            System.out.println("e1 = " + e);
            e.printStackTrace();
        }
    }
}
