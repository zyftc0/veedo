package tech.veedo.munchkin.constant;

import lombok.Getter;

/**
 * 审核人员的类型，允许机构/岗位去审核
 */
@Getter
public enum AuditorTypeEnum {

    PSN("PSN", "个人"),
    POST("POST", "机构/岗位");

    private String code;
    private String mean;

    AuditorTypeEnum(String code, String mean) {
        this.code = code;
        this.mean = mean;
    }

    public static AuditorTypeEnum getAuditorType(String code) {
        for (AuditorTypeEnum auditType : AuditorTypeEnum.values()) {
            if (auditType.getCode().equals(code)) {
                return auditType;
            }
        }
        return null;
    }

}
