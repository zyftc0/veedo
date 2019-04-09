package tech.veedo.ragdoll.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
public class GlobalException extends Exception {

    private Integer errorCode;

    @Setter
    private String detailMessage;

    public GlobalException() {
        this.errorCode = GlobalExceptionCode.COMMON.getErrorCode();
        this.detailMessage = GlobalExceptionCode.COMMON.getDetailMessage();
    }

    public GlobalException(GlobalExceptionCode error) {
        this.errorCode = error.getErrorCode();
        this.detailMessage = GlobalExceptionCode.COMMON.getDetailMessage();
    }

    public GlobalException(String detailMessage) {
        this.errorCode = GlobalExceptionCode.COMMON.getErrorCode();
        this.detailMessage = detailMessage;
    }

    public GlobalException(GlobalExceptionCode error, String detailMessage) {
        this.errorCode = error.getErrorCode();
        this.detailMessage = detailMessage;
    }

}
