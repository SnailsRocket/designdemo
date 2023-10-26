package com.xubo.snailsrocket;

import java.math.BigDecimal;

/**
 * @Author xubo
 * @Date 2023/10/26 16:36
 * @Description：装修物料
 * @Version 1.0
 */
public interface Matter {
    /**
     * 场景；地板、地砖、涂料、吊顶
     */
    String scene();

    /**
     * 品牌
     */
    String brand();

    /**
     * 型号
     */
    String model();

    /**
     * 平米报价
     */
    BigDecimal price();

    /**
     * 描述
     */
    String desc();
}
