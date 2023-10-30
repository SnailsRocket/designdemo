package com.xubo.snailsrocket;

import com.alibaba.fastjson.JSON;
import com.xubo.snailsrocket.mq.OrderMq;

/**
 * @Author xubo
 * @Date 2023/10/30 14:14
 * @Description：
 * @Version 1.0
 */
public class OrderMqService {
    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }
}
