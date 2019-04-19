package tech.veedo.munchkin.workflow.server.inner;

import org.springframework.beans.factory.annotation.Autowired;
import tech.veedo.munchkin.workflow.server.entity.Workflow;
import tech.veedo.munchkin.workflow.server.service.WorkflowService;

import java.sql.SQLException;
import java.util.List;

public class WorkflowManager {

    @Autowired
    private WorkflowService workflowService;

    public List<Workflow> queryAllWorkflows() throws SQLException {
        return workflowService.queryWorkflowList();
    }

}
