package tech.veedo.munchkin.constants;

import lombok.Getter;

@Getter
public enum WorkFlowCodeEnum {

    DEFAULT("default");

    private String code;

    WorkFlowCodeEnum(String code) {
        this.code = code;
    }

}
