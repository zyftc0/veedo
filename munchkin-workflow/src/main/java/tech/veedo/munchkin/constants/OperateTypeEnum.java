package tech.veedo.munchkin.constants;

/**
 * 操作类型，适用于各种情况，包括工单类型
 */
public enum OperateTypeEnum {
    ADD(1, "新增"),
    UPDATE(2, "修改"),
    DELETE(3, "删除"),
    SEARCH(4, "查询");

    private Integer code;
    private String msg;

    OperateTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static OperateTypeEnum getFormType(Integer code) {
        for (OperateTypeEnum formType : OperateTypeEnum.values()) {
            if (formType.getCode() == code) {
                return formType;
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
