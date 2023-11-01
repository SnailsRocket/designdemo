package com.xubo.snailsrocket.service.engine;

import com.xubo.snailsrocket.model.aggregates.TreeRich;
import com.xubo.snailsrocket.model.vo.EngineResult;

import java.util.Map;

/**
 * @Author xubo
 * @Date 2023/10/30 17:59
 * @Description：
 * @Version 1.0
 */
public interface IEngine {
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
