package com.xubo.snailsrocket.design.store;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/12 17:59
 * @Description：
 * @Version 1.0
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
