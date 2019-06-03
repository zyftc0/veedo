package tech.veedo.munchkin.workflow.background.entity;

import lombok.Data;
import tech.veedo.munchkin.domain.WorkflowRoot;

import java.time.LocalDateTime;

/**
 * 最顶层工作流
 */
@Data
public class Workflow extends WorkflowRoot {

    /**
     * 创建人sub信息
     */
    public String createPsnSub;

    /**
     * 创建人组织路径
     */
    public String createPsnOrg;

    /**
     * 创建人
     */
    public String createPerson;

    /**
     * 创建时间
     */
    public LocalDateTime createTime;

    /**
     * 修改人sub信息
     */
    public String updatePsnSub;

    /**
     * 修改人组织路径
     */
    public String updatePsnOrg;

    /**
     * 修改人
     */
    public String updatePerson;

    /**
     * 修改时间
     */
    public LocalDateTime updateTime;

    /**
     * 版本（乐观锁）
     */
    public Integer version;

    /**
     * id
     */
    public String id;

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
