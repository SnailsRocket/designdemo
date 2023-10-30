package com.xubo.snailsrocket;

import com.alibaba.fastjson.JSON;
import com.xubo.snailsrocket.mq.create_account;

/**
 * @Author xubo
 * @Date 2023/10/30 14:15
 * @Description：
 * @Version 1.0
 */
public class create_accountMqService {
    public void onMessage(String message) {

        create_account mq = JSON.parseObject(message, create_account.class);

        mq.getNumber();
        mq.getAccountDate();


        // ... 处理自己的业务
    }
}
