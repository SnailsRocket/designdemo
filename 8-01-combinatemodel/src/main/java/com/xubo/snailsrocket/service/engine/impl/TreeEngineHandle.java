package com.xubo.snailsrocket.service.engine.impl;

import com.xubo.snailsrocket.model.aggregates.TreeRich;
import com.xubo.snailsrocket.model.vo.EngineResult;
import com.xubo.snailsrocket.model.vo.TreeNode;
import com.xubo.snailsrocket.service.engine.EngineBase;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 18:00
 * @Description：
 * @Version 1.0
 */
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
