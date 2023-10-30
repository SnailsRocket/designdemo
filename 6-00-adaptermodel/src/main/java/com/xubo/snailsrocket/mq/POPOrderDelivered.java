package com.xubo.snailsrocket.mq;


import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author xubo
 * @Date 2023/10/30 13:57
 * @Description：订单妥投消息
 * @Version 1.0
 */
public class POPOrderDelivered {
    private String uId;     // 用户ID
    private String orderId; // 订单号
    private Date orderTime; // 下单时间
    private Date sku;       // 商品
    private Date skuName;   // 商品名称
    private BigDecimal decimal; // 金额

    @Override
    public String toString() {
        return "POPOrderDelivered{" +
                "uId='" + uId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", orderTime=" + orderTime +
                ", sku=" + sku +
                ", skuName=" + skuName +
                ", decimal=" + decimal +
                '}';
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getSku() {
        return sku;
    }

    public void setSku(Date sku) {
        this.sku = sku;
    }

    public Date getSkuName() {
        return skuName;
    }

    public void setSkuName(Date skuName) {
        this.skuName = skuName;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }
}
