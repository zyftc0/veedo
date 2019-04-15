package tech.veedo.munchkin.workflow.server.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import tech.veedo.munchkin.domain.BaseEntity;

/**
 * <p>
 *
 * </p>
 *
 * @author zhang yif
 * @since 2019-01-03
 */
@Data
@Accessors(chain = true)
public class WorkflowOrgNodeAuditor extends BaseEntity {
    /**
     * wf_workflow_org_node表的ID
     */
    private String wfNodeId;
    /**
     * 审核人员类型：post、psn
     */
    private String auditorType;
    /**
     * 人员ID
     */
    private String personId;
    /**
     * 人员名称
     */
    private String personName;
    /**
     * 岗位ID
     */
    private String postCode;
    /**
     * 岗位名称
     */
    private String postName;

}
