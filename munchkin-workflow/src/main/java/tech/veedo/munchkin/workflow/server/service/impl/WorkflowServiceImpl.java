package tech.veedo.munchkin.workflow.server.service.impl;

import tech.veedo.munchkin.workflow.server.entity.Workflow;
import tech.veedo.munchkin.workflow.server.service.WorkflowService;

import java.util.List;

public class WorkflowServiceImpl implements WorkflowService {
    /**
     * 获取WorkFlowlist LIST
     *
     * @return
     */
    @Override
    public List<Workflow> queryWorkflowList() {
        return null;
    }

    /**
     * 保存
     *
     * @param flow
     * @return
     */
    @Override
    public Boolean saveWorkflow(Workflow flow) {
        return null;
    }

    /**
     * 更新
     *
     * @param flow
     * @return
     */
    @Override
    public Boolean updateWorkflow(Workflow flow) {
        return null;
    }

    /**
     * 通过ID删除
     *
     * @param id
     * @return
     */
    @Override
    public Boolean deleteWorkflowById(String id) {
        return null;
    }

    /**
     * 根据工作流编码查询出一个workflow
     *
     * @param code
     * @return
     */
    @Override
    public Workflow queryWorkflowByCode(String code) {
        return null;
    }
}
