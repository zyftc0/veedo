package tech.veedo.munchkin.workflow.server.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import tech.veedo.munchkin.domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;

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
public class WorkflowOrgNode extends BaseEntity {

    /**
     * wf_workflow_org_mapping表的ID
     */
    private String wfMappingId;

    /**
     * 节点名称
     */
    private String nodeName;

    /**
     * 节点顺序
     */
    private Integer nodeSort;

    /**
     * 是否全部通过才能通过
     */
    private Boolean allChecked;

    private List<WorkflowOrgNodeAuditor> auditors = new ArrayList<>();

}
