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
 * @since 2019-01-02
 */
@Data
@Accessors(chain = true)
public class Workflow extends BaseEntity {

    /**
     * 流程编码
     */
    private String workflowCode;

    /**
     * 流程名称
     */
    private String workflowName;

    /**
     * 有效
     */
    private Boolean inUse;

}
