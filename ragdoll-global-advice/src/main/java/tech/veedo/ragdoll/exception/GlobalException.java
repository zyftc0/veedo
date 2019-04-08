package tech.veedo.ragdoll.exception;

public class GlobalException extends Exception {

    private Integer errorCode;

    private String detailMessage;

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    public GlobalException() {
        new GlobalException(GlobalExceptionCode.COMMON, GlobalExceptionCode.COMMON.getDetailMessage());
    }

    public GlobalException(GlobalExceptionCode error) {
        new GlobalException(error, error.getDetailMessage());
    }

    public GlobalException(String detailMessage) {
        new GlobalException(GlobalExceptionCode.COMMON, detailMessage);
    }

    public GlobalException(GlobalExceptionCode error, String detailMessage) {
        this.errorCode = error.getErrorCode();
        this.detailMessage = detailMessage;
    }

}
