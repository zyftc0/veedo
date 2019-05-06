package tech.veedo.ragdoll.globaladvice;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GlobalAdviceEntity {

    /**
     * 状态码
     */
    private Integer statusCode = 200;

    /**
     * 响应状态码
     */
    private boolean success = true;

    /**
     * 响应信息
     */
    private String message = "调用接口成功";

    /**
     * 返回数据
     */
    private Object data;

}
