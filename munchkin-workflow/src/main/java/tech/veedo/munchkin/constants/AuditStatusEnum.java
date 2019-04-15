package tech.veedo.munchkin.constants;

/**
 * 审核状态
 *
 * @author zhang yif
 * @create 2019-01-15
 **/
public enum AuditStatusEnum {
    AUDITING(0, "审核中"),
    COMPLETE(1, "审核通过"),
    REJECT(2, "驳回");

    private Integer code;
    private String msg;

    AuditStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static AuditStatusEnum getAuditStatus(Integer code) {
        for (AuditStatusEnum auditStatus : AuditStatusEnum.values()) {
            if (auditStatus.getCode().equals(code)) {
                return auditStatus;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
