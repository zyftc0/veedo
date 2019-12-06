package tech.veedo.ragdoll.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
public class GlobalException extends RuntimeException {

    private Integer errorCode;

    @Setter
    private String message;

    @Setter
    private Object data;

    public GlobalException() {
        this.errorCode = GlobalExceptionCode.COMMON.getErrorCode();
        this.message = GlobalExceptionCode.COMMON.getMessage();
    }

    public GlobalException(GlobalExceptionCode error) {
        this.errorCode = error.getErrorCode();
        this.message = GlobalExceptionCode.COMMON.getMessage();
    }

    public GlobalException(String message) {
        this.errorCode = GlobalExceptionCode.COMMON.getErrorCode();
        this.message = message;
    }

    public GlobalException(Object data) {
        this.errorCode = GlobalExceptionCode.COMMON.getErrorCode();
        this.message = GlobalExceptionCode.COMMON.getMessage();
        this.data = data;
    }

    public GlobalException(String message, Object data) {
        this.errorCode = GlobalExceptionCode.COMMON.getErrorCode();
        this.message = message;
        this.data = data;
    }

    public GlobalException(GlobalExceptionCode error, String message) {
        this.errorCode = error.getErrorCode();
        this.message = message;
    }

    public GlobalException(Integer customErrorCode, String message) {
        this.errorCode = customErrorCode;
        this.message = message;
    }

    public GlobalException(GlobalExceptionCode error, String message, Object data) {
        this.errorCode = error.getErrorCode();
        this.message = message;
        this.data = data;
    }

    public GlobalException(Integer customErrorCode, String message, Object data) {
        this.errorCode = customErrorCode;
        this.message = message;
        this.data = data;
    }

}
