package com.xubo.snailsrocket;

import com.alibaba.fastjson.JSON;
import com.xubo.snailsrocket.mq.POPOrderDelivered;

/**
 * @Author xubo
 * @Date 2023/10/30 14:16
 * @Description：
 * @Version 1.0
 */
public class POPOrderDeliveredService {
    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }
}
