package tech.veedo.munchkin.database;

public class Tables {

    /**
     * 工作流表
     */
    public static String WORKFLOW = "wf_workflow";

    /**
     * 工作流与机构映射表
     */
    public static String WORKFLOW_MAPPING = "wf_workflow_org_mapping";

    /**
     * 映射的节点表
     */
    public static String WORKFLOW_NODE = "wf_workflow_org_node";

    /**
     * 节点的审核人表
     */
    public static String WORKFLOW_AUDITOR = "wf_workflow_org_node_auditor";

    /**
     * 工单表
     */
    public static String AUDIT_FORM = "wf_audit_form";

    /**
     * 映射审核状态表
     */
    public static String MAPPING_PASSING = "wf_mapping_passing";

    /**
     * 节点审核状态表
     */
    public static String NODE_PASSING = "wf_node_passing";

    /**
     * 审核人审核状态表
     */
    public static String AUDITOR_PASSING = "wf_auditor_passing";

}
