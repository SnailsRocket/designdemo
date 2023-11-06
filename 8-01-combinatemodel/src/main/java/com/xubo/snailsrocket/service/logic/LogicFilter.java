package com.xubo.snailsrocket.service.logic;

import com.xubo.snailsrocket.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 18:00
 * @Description：过滤器接口
 * @Version 1.0
 */
public interface LogicFilter {
    /**
     * 逻辑决策器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return 决策值
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
