package com.xubo.snailsrocket.design;

import com.alibaba.fastjson.JSON;
import com.xubo.snailsrocket.design.card.IQiYiCardService;
import com.xubo.snailsrocket.design.coupon.CouponResult;
import com.xubo.snailsrocket.design.coupon.CouponService;
import com.xubo.snailsrocket.design.goods.DeliverReq;
import com.xubo.snailsrocket.design.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

/**
 * @Author xubo
 * @Date 2023/10/12 17:29
 * @Description：使用if-else来处理不同的业务逻辑，可以将这三个类放入工厂中，然后根据type去获取这些类，参考项目2，但是这是最优解吗
 * @Version 1.0
 */
public class PrizeController {

    private Logger log = LoggerFactory.getLogger(PrizeController.class);

    /**
     * 使用if-else来处理不同的业务逻辑，可以将这三个类放入工厂中，然后根据type去获取这些类，参考项目2，但是这是最优解吗
     * @param req
     * @return
     */
    public AwardRes awardToUser(AwardReq req) {
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;
        try {
            log.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
            // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if (req.getAwardType() == 1) {
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
                if(Objects.equals(couponResult.getCode(), "0000")) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            } else if(req.getAwardType() == 2) {
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUserName(queryUserName(req.getuId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if (isSuccess) {
                    awardRes = new AwardRes("0000", "发放成功");
                } else {
                    awardRes = new AwardRes("0001", "发放失败");
                }
            } else if(req.getAwardType() == 3) {
                String bindMobileNumber = queryUserPhoneNumber(req.getuId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber, req.getAwardNumber());
                awardRes = new AwardRes("0000", "发放成功");
            }
            log.info("奖品发放完成{}。", req.getuId());
        } catch (Exception e) {
            log.error("奖品发放失败{}。req:{}", req.getuId(), reqJson, e);
            e.printStackTrace();
        }
        return awardRes;
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "18627837596";
    }

}
