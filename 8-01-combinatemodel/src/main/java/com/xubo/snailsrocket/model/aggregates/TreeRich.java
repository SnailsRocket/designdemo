package com.xubo.snailsrocket.model.aggregates;

import com.xubo.snailsrocket.model.vo.TreeNode;
import com.xubo.snailsrocket.model.vo.TreeRoot;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 17:56
 * @Description：
 * @Version 1.0
 */
public class TreeRich {
    private TreeRoot treeRoot;                          //树根信息
    private Map<Long, TreeNode> treeNodeMap;        //树节点ID -> 子节点

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
