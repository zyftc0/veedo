package tech.veedo.munchkin.constants;

import lombok.Getter;

@Getter
public enum WFExceptionCode {
    NULL_POINTER(301),
    ALREADY_INUSE(302);

    private Integer status;

    WFExceptionCode(Integer status) {
        this.status = status;
    }

}
