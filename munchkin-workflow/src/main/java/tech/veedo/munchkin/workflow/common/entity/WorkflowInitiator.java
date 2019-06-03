package tech.veedo.munchkin.workflow.common.entity;

import lombok.Data;
import tech.veedo.munchkin.domain.WorkflowRoot;

/**
 * 流程发起人
 */
@Data
public class WorkflowInitiator extends WorkflowRoot {

    private String workflowId;

    private String beginOrgCode;

    private String beginOrgName;

    private String beginnerType;

    private String beginPsnSub;

    private String beginPsnName;

    private String beginPostCode;

    private String beginPostName;

}
