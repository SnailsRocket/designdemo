package com.xubo.snailsrocket.ceiling;

import com.xubo.snailsrocket.Matter;

import java.math.BigDecimal;

/**
 * @Author xubo
 * @Date 2023/10/26 16:38
 * @Description：
 * @Version 1.0
 */
public class LevelOneCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造型只做低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
