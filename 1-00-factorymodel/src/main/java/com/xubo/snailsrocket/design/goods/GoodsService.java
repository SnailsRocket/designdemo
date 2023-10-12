package com.xubo.snailsrocket.design.goods;

import com.alibaba.fastjson.JSON;

/**
 * @Author xubo
 * @Date 2023/10/12 17:14
 * @Description：模拟实物商品服务
 * @Version 1.0
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));
        return Boolean.TRUE;
    }
}
