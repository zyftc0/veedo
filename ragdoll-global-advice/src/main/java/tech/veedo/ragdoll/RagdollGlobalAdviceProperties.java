package tech.veedo.ragdoll;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "veedo.ragdoll")
class RagdollGlobalAdviceProperties {

    private GlobalAdvice globalAdvice;

    private ExceptionAdvice exceptionAdvice;

    @Data
    protected static class GlobalAdvice {

        /**
         * 是否启用
         */
        private Boolean enabled = false;

        /**
         * 不需要使用全局返回结果的方法
         */
        private String ignoreMethods;

    }

    @Data
    protected static class ExceptionAdvice {

        /**
         * 是否启用
         */
        private Boolean enabled = false;

    }

}
