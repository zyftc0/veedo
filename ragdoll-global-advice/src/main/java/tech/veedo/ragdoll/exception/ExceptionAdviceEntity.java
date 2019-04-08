package tech.veedo.ragdoll.exception;

public class ExceptionAdviceEntity {

    /**
     * 响应状态码
     */
    private boolean success = true;

    /**
     * 状态码
     */
    private Integer statusCode = 200;

    /**
     * 响应信息
     */
    private String msg = "调用接口成功";

    public boolean isSuccess() {
        return success;
    }

    protected ExceptionAdviceEntity setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    protected ExceptionAdviceEntity setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    protected ExceptionAdviceEntity setMsg(String msg) {
        this.msg = msg;
        return this;
    }
}
