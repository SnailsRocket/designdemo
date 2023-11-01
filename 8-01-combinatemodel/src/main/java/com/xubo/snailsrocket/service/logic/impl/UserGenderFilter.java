package com.xubo.snailsrocket.service.logic.impl;

import com.xubo.snailsrocket.service.logic.BaseLogic;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 18:01
 * @Description：
 * @Version 1.0
 */
public class UserGenderFilter extends BaseLogic {
    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }

}
