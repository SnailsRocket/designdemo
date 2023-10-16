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
        return StragegyContext.getRegister(commodityType);
    }
}
