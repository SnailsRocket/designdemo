package com.xubo.snailsrocket.design;

/**
 * @Author xubo
 * @Date 2023/10/12 17:28
 * @Description：
 * @Version 1.0
 */
public class AwardRes {

    private String code; // 编码
    private String info; // 描述

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public AwardRes(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
