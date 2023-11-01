package com.xubo.snailsrocket.service.engine;

import com.xubo.snailsrocket.service.logic.LogicFilter;
import com.xubo.snailsrocket.service.logic.impl.UserAgeFilter;
import com.xubo.snailsrocket.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author xubo
 * @Date 2023/10/30 17:59
 * @Description：
 * @Version 1.0
 */
public class EngineConfig {
    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }
}
