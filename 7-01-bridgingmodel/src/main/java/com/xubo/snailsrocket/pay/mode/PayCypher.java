package com.xubo.snailsrocket.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author xubo
 * @Date 2023/10/30 17:04
 * @Description：
 * @Version 1.0
 */
public class PayCypher implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    @Override
    public boolean security(String uId) {
        logger.info("密码支付，风控校验环境安全");
        return Boolean.TRUE;
    }

}
