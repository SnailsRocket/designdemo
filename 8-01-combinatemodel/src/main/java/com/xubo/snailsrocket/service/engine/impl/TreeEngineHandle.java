package com.xubo.snailsrocket.service.engine.impl;

import com.xubo.snailsrocket.model.aggregates.TreeRich;
import com.xubo.snailsrocket.model.vo.EngineResult;
import com.xubo.snailsrocket.model.vo.TreeNode;
import com.xubo.snailsrocket.service.engine.EngineBase;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 18:00
 * @Description：tree流程引擎
 * @Version 1.0
 */
public class TreeEngineHandle extends EngineBase {

    /**
     *
     * @param treeId treeId 数id
     * @param userId userId 用户id
     * @param treeRich tree
     * @param decisionMatter 匹配规则
     * @return
     */
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
