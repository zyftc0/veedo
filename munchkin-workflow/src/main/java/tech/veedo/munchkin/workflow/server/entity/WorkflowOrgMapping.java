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
public class WorkflowOrgMapping extends BaseEntity {

    /**
     * workflow表的ID
     */
    private String wfWorkflowId;
    /**
     * 映射名称
     */
    private String mappingName;
    /**
     * 所属组织编码
     */
    private String orgCode;
    /**
     * 所属组织名称
     */
    private String orgName;
    /**
     * 上级组织编码
     */
    private String parentOrgCode;
    /**
     * 是否挂起到上级
     */
    private Boolean hangUp;
    /**
     * 是否启用
     */
    private Boolean inUse;

    private List<WorkflowOrgNode> nodes = new ArrayList<>();

}
