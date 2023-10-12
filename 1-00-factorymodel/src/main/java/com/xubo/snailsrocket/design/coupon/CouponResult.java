package com.xubo.snailsrocket.design.coupon;

/**
 * @Author xubo
 * @Date 2023/10/12 17:09
 * @Description：
 * @Version 1.0
 */
public class CouponResult {

    private String code;
    private String info;

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
