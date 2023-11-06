package com.xubo.snailsrocket.service.logic.impl;

import com.xubo.snailsrocket.service.logic.BaseLogic;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 18:01
 * @Description：age过滤器
 * @Version 1.0
 */
public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
