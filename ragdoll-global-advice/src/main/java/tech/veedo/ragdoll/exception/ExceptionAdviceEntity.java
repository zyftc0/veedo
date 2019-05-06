package tech.veedo.ragdoll.exception;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ExceptionAdviceEntity {

    /**
     * 状态码
     */
    private Integer statusCode = 200;

    /**
     * 响应状态码
     */
    private boolean success = false;

    /**
     * 错误码
     */
    private Integer errorCode = 300;

    /**
     * 响应信息
     */
    private String message = "调用接口成功";



}
