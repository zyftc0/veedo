package tech.veedo.munchkin.constant;

import lombok.Getter;

/**
 * 审核状态
 *
 * @author zhang yif
 * @create 2019-01-15
 **/
@Getter
public enum AuditStatusEnum {
    AUDITING(0, "审核中"),
    COMPLETE(1, "审核通过"),
    REJECT(2, "驳回");

    private Integer code;
    private String mean;

    AuditStatusEnum(Integer code, String mean) {
        this.code = code;
        this.mean = mean;
    }

    public static AuditStatusEnum getAuditStatus(Integer code) {
        for (AuditStatusEnum auditStatus : AuditStatusEnum.values()) {
            if (auditStatus.getCode().equals(code)) {
                return auditStatus;
            }
        }
        return null;
    }
}
