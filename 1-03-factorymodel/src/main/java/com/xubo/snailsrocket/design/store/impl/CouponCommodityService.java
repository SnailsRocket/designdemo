package com.xubo.snailsrocket.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.xubo.snailsrocket.design.coupon.CouponResult;
import com.xubo.snailsrocket.design.coupon.CouponService;
import com.xubo.snailsrocket.design.enums.CommonditytrategyEnum;
import com.xubo.snailsrocket.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/12 17:58
 * @Description：
 * @Version 1.0
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    private static final CouponCommodityService instance = new CouponCommodityService();

    public CouponCommodityService() {
        register(getStrategyEnum(), instance);
    }

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }

    @Override
    public CommonditytrategyEnum getStrategyEnum() {
        return CommonditytrategyEnum.CouponCommodityService;
    }
}
