package com.xubo.snailsrocket.design.enums;

/**
 * @Author xubo
 * @Date 2023/10/12 20:24
 * @Description：
 * @Version 1.0
 */
public enum CommonditytrategyEnum {

    CardCommodityService(1, "CardCommodityService"),
    CouponCommodityService(2, "CouponCommodityService"),
    GoodsCommodityService(3, "GoodsCommodityService");

    private Integer id;
    private String commodityStr;

    CommonditytrategyEnum(Integer id, String commodityStr) {
        this.id = id;
        this.commodityStr = commodityStr;
    }

    public Integer getId() {
        return id;
    }

    public String getCommodityStr() {
        return commodityStr;
    }
}
