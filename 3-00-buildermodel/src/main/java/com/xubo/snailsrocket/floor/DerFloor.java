package com.xubo.snailsrocket.floor;

import com.xubo.snailsrocket.Matter;

import java.math.BigDecimal;

/**
 * @Author xubo
 * @Date 2023/10/26 16:41
 * @Description：
 * @Version 1.0
 */
public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔(Der)";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业木地板制造商，北京2008年奥运会家装和公装地板供应商";
    }
}
