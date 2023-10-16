package com.xubo.snailsrocket.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.xubo.snailsrocket.design.StragegyContext;
import com.xubo.snailsrocket.design.card.IQiYiCardService;
import com.xubo.snailsrocket.design.enums.CommonditytrategyEnum;
import com.xubo.snailsrocket.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author xubo
 * @Date 2023/10/12 17:58
 * @Description：
 * @Version 1.0
 */
public class CardCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    // 模拟注入
    private IQiYiCardService iQiYiCardService = new IQiYiCardService();

    private static final CardCommodityService instance = new CardCommodityService();

    /**
     * 构造项目的时候将当前对象注册到容器中
     */
    public CardCommodityService() {
        register(getStrategyEnum(), instance);
    }

    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iQiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }

    @Override
    public CommonditytrategyEnum getStrategyEnum() {
        return CommonditytrategyEnum.CardCommodityService;
    }

    private String queryUserMobile(String uId) {
        return "15200101232";
    }
}
