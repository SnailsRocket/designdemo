package com.xubo.snailsrocket.cuisine.impl;

import com.xubo.snailsrocket.OrderAdapterService;
import com.xubo.snailsrocket.service.POPOrderService;

/**
 * @Author xubo
 * @Date 2023/10/30 14:36
 * @Description：
 * @Version 1.0
 */
public class POPOrderAdapterServiceImpl implements OrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();
    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
