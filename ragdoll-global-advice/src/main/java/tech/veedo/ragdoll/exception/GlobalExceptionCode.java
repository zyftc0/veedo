package tech.veedo.ragdoll.exception;

import lombok.Getter;

@Getter
public enum GlobalExceptionCode {

    COMMON(300, "统一标准异常"),
    NULL_POINTER(301, "空指针异常");

    private Integer errorCode;

    private String detailMessage;

    GlobalExceptionCode(Integer errorCode, String detailMessage) {
        this.errorCode = errorCode;
        this.detailMessage = detailMessage;
    }

}
