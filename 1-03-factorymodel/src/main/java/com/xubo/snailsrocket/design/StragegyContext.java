package com.xubo.snailsrocket.design;

import com.xubo.snailsrocket.design.store.ICommodity;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/12 18:56
 * @Description：
 * @Version 1.0
 */
public class StragegyContext {

    public static final Map<Integer, ICommodity> registerMap = new HashMap<Integer, ICommodity>();

    public static void register(Integer commodityType, ICommodity commodity) {
        registerMap.putIfAbsent(commodityType, commodity);
    }

    public static ICommodity getRegister(Integer commodityType) {
        if(commodityType == null) {
            return null;
        }
        return registerMap.get(commodityType);
    }

}
