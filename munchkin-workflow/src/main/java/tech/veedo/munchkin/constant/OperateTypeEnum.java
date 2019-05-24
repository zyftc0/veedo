package tech.veedo.munchkin.constant;

import lombok.Getter;

/**
 * 操作类型，适用于各种情况，包括工单类型
 */
@Getter
public enum OperateTypeEnum {
    ADD(1, "新增"),
    UPDATE(2, "修改"),
    DELETE(3, "删除"),
    SEARCH(4, "查询");

    private Integer code;
    private String mean;

    OperateTypeEnum(Integer code, String mean) {
        this.code = code;
        this.mean = mean;
    }

    public static OperateTypeEnum getFormType(Integer code) {
        for (OperateTypeEnum formType : OperateTypeEnum.values()) {
            if (formType.getCode() == code) {
                return formType;
            }
        }
        return null;
    }
}
