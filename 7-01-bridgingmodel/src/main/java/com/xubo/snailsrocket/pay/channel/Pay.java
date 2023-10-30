package com.xubo.snailsrocket.pay.channel;

import com.xubo.snailsrocket.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @Author xubo
 * @Date 2023/10/30 17:01
 * @Description：
 * @Version 1.0
 */
public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
