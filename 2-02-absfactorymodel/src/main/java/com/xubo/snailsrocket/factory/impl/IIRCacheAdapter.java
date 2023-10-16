package com.xubo.snailsrocket.factory.impl;

import com.xubo.snailsrocket.factory.ICacheAdapter;
import com.xubo.snailsrocket.matter.IIR;

import java.util.concurrent.TimeUnit;

/**
 * @Author xubo
 * @Date 2023/10/16 13:55
 * @Description：
 * @Version 1.0
 */
public class IIRCacheAdapter implements ICacheAdapter {

    private IIR iir = new IIR();

    public String get(String key) {
        return iir.get(key);
    }

    public void set(String key, String value) {
        iir.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        iir.setExpire(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        iir.del(key);
    }
}
