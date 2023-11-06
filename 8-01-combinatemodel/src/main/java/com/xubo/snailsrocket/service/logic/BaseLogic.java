package com.xubo.snailsrocket.service.logic;

import com.xubo.snailsrocket.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 18:00
 * @Description：抽象类 要么是抽象方法没有实现方式，要么是有具体的实现
 * 基本的逻辑判断
 * @Version 1.0
 */
public abstract class BaseLogic implements LogicFilter{

    /**
     * 根据 matterValue 找出下一个节点id
     * @param matterValue          决策值
     * @param treeNodeLinkList
     * @return
     */
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink nodeLine : treeNodeLinkList) {
            if (decisionLogic(matterValue, nodeLine)) return nodeLine.getNodeIdTo();
        }
        return 0L;
    }

    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    /**
     * 比较当前值跟节点中的值的大小，这个地方替代了if-else的判断
     * 将数值大小的判断逻辑 迁移到这个地方来，并且使用switch来实现，优化了代码的结构
     * @param matterValue
     * @param nodeLink
     * @return
     */
    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
