package tech.veedo.munchkin.constant;

import lombok.Getter;

/**
 * 流程公有私有枚举
 * 公有流程不检验流程发起人
 * 私有流程检验流程发起人是否有权限发起流程
 */
@Getter
public enum WorkflowPPEnum {
    PUBLIC(1, "共有"),
    PRIVATE(0, "私有");

    private Integer code;
    private String msg;

    WorkflowPPEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static WorkflowPPEnum getWorkflowPP(Integer code) {
        for (WorkflowPPEnum a : WorkflowPPEnum.values()) {
            if (a.getCode().equals(code)) {
                return a;
            }
        }
        return null;
    }

}
