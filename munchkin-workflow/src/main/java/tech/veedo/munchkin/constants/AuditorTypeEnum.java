package tech.veedo.munchkin.constants;

public enum AuditorTypeEnum {
    PSN("psn", "个人"),
    POST("post", "岗位/机构");

    private String code;
    private String msg;

    AuditorTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static AuditorTypeEnum getAuditorType(String code) {
        for (AuditorTypeEnum auditType : AuditorTypeEnum.values()) {
            if (auditType.getCode().equals(code)) {
                return auditType;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
