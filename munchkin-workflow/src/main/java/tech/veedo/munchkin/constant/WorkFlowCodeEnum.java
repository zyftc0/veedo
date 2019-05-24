package tech.veedo.munchkin.constant;

import lombok.Getter;

@Getter
public enum WorkFlowCodeEnum {

    DEFAULT("DEFAULT");

    private String code;

    WorkFlowCodeEnum(String code) {
        this.code = code;
    }

}
