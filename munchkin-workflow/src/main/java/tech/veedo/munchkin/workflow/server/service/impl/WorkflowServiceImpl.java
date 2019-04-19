package tech.veedo.munchkin.workflow.server.service.impl;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.GenerousBeanProcessor;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.beans.factory.annotation.Autowired;
import tech.veedo.munchkin.database.DatabaseAssistant;
import tech.veedo.munchkin.database.Tables;
import tech.veedo.munchkin.workflow.server.entity.Workflow;
import tech.veedo.munchkin.workflow.server.service.WorkflowService;

import java.sql.SQLException;
import java.util.List;

public class WorkflowServiceImpl implements WorkflowService {

    @Autowired
    private DatabaseAssistant databaseAssistant;

    /**
     * 获取WorkFlowlist LIST
     *
     * @return
     */
    @Override
    public List<Workflow> queryWorkflowList() throws SQLException {
        String sql = "select * from " + Tables.WORKFLOW;
        List<Workflow> workflows = databaseAssistant.getQueryRunner()
                .query(sql, new BeanListHandler<>(Workflow.class, new BasicRowProcessor(new GenerousBeanProcessor())));
        return workflows;
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
