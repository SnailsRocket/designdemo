package com.xubo.snailsrocket.design.card;

/**
 * @Author xubo
 * @Date 2023/10/12 17:07
 * @Description：模拟爱奇艺会员卡服务
 * @Version 1.0
 */
public class IQiYiCardService {

    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }
}
