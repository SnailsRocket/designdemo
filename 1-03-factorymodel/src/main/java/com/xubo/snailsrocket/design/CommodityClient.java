package com.xubo.snailsrocket.design;

import com.xubo.snailsrocket.design.store.ICommodity;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/12 21:41
 * @Description：
 * @Version 1.0
 */
@Data
public class CommodityClient {

    private Logger log = LoggerFactory.getLogger(CommodityClient.class);

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap, Integer commodityType) {
        try {
            ICommodity commodity = StragegyContext.getRegister(commodityType);
            commodity.sendCommodity(uId, commodityId, bizId, extMap);
        } catch (Exception e) {
            log.info("exception print: {}", e);
            e.printStackTrace();
        }
    }
}
