package com.xubo.snailsrocket;

import org.junit.Test;

/**
 * @Author xubo
 * @Date 2023/10/26 20:00
 * @Description：原型模式
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }

}
