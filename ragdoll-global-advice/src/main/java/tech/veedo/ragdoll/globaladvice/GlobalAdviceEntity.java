package tech.veedo.ragdoll.globaladvice;

public class GlobalAdviceEntity {

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

    /**
     * 返回数据
     */
    private Object data;

    public boolean isSuccess() {
        return success;
    }

    public GlobalAdviceEntity setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public GlobalAdviceEntity setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public GlobalAdviceEntity setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    protected GlobalAdviceEntity setData(Object data) {
        this.data = data;
        return this;
    }
}
