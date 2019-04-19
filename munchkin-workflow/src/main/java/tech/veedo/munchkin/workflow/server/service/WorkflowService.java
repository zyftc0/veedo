package tech.veedo.munchkin.workflow.server.service;



import tech.veedo.munchkin.workflow.server.entity.Workflow;

import java.sql.SQLException;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zhang yif
 * @since 2019-01-02
 */
public interface WorkflowService {

    /**
     * 获取WorkFlowlist LIST
     *
     * @return
     */
    List<Workflow> queryWorkflowList() throws SQLException;

    /**
     * 保存
     *
     * @param flow
     * @return
     */
    Boolean saveWorkflow(Workflow flow);

    /**
     * 更新
     *
     * @param flow
     * @return
     */
    Boolean updateWorkflow(Workflow flow);

    /**
     * 通过ID删除
     *
     * @param id
     * @return
     */
    Boolean deleteWorkflowById(String id);

    /**
     * 根据工作流编码查询出一个workflow
     * @param code
     * @return
     */
    Workflow queryWorkflowByCode(String code);
}
