package com.xubo.snailsrocket.design.store;

import com.xubo.snailsrocket.design.StragegyContext;
import com.xubo.snailsrocket.design.enums.CommonditytrategyEnum;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/12 17:59
 * @Description：
 * @Version 1.0
 */
public interface ICommodity {

    /**
     * 提供给这个接口的实现类，实现将自己注入到容器中
     * @param commonditytrategyEnum
     * @param commodity
     */
    public default void register(CommonditytrategyEnum commonditytrategyEnum, ICommodity commodity) {
        StragegyContext.register(commonditytrategyEnum.getId(), commodity);
    }

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

    CommonditytrategyEnum getStrategyEnum();
}
