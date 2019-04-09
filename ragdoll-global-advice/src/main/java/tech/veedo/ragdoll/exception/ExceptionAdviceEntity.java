package tech.veedo.ragdoll.exception;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
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

}
