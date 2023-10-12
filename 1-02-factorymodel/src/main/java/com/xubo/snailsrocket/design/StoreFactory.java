package com.xubo.snailsrocket.design;

import com.xubo.snailsrocket.design.store.ICommodity;
import com.xubo.snailsrocket.design.store.impl.CardCommodityService;
import com.xubo.snailsrocket.design.store.impl.CouponCommodityService;
import com.xubo.snailsrocket.design.store.impl.GoodsCommodityService;

/**
 * @Author xubo
 * @Date 2023/10/12 17:54
 * @Description：
 * @Version 1.0
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) {
            return null;
        }
        if (1 == commodityType) {
            return new CouponCommodityService();
        }
        if (2 == commodityType) {
            return new GoodsCommodityService();
        }
        if (3 == commodityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品服务类型");
    }
}
