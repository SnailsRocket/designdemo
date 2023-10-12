package com.xubo.snailsrocket.design.coupon;

/**
 * @Author xubo
 * @Date 2023/10/12 17:09
 * @Description：模拟优惠券服务
 * @Version 1.0
 */
public class CouponService {

    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
