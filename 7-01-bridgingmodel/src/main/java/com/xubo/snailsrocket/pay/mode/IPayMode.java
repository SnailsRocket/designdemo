package com.xubo.snailsrocket.pay.mode;

/**
 * @Author xubo
 * @Date 2023/10/30 17:03
 * @Description：
 * @Version 1.0
 */
public interface IPayMode {
    boolean security(String uId);
}
