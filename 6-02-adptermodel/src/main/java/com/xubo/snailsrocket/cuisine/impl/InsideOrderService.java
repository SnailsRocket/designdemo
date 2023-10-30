package com.xubo.snailsrocket.cuisine.impl;

import com.xubo.snailsrocket.OrderAdapterService;
import com.xubo.snailsrocket.service.OrderService;

/**
 * @Author xubo
 * @Date 2023/10/30 14:36
 * @Description：
 * @Version 1.0
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
