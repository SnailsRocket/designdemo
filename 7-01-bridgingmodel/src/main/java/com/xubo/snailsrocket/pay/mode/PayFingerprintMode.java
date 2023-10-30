package com.xubo.snailsrocket.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author xubo
 * @Date 2023/10/30 17:10
 * @Description：
 * @Version 1.0
 */
public class PayFingerprintMode implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return Boolean.TRUE;
    }
}
