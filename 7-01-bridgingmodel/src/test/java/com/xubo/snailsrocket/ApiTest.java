package com.xubo.snailsrocket;

import com.xubo.snailsrocket.pay.channel.Pay;
import com.xubo.snailsrocket.pay.channel.WxPay;
import com.xubo.snailsrocket.pay.channel.ZfbPay;
import com.xubo.snailsrocket.pay.mode.PayFaceMode;
import com.xubo.snailsrocket.pay.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @Author xubo
 * @Date 2023/10/30 17:15
 * @Description：
 * @Version 1.0
 */
public class ApiTest {

    @Test
    public void test_pay() {
        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_1092033111", "100000109893", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("jlu19dlxo111","100000109894",new BigDecimal(100));
    }
}
