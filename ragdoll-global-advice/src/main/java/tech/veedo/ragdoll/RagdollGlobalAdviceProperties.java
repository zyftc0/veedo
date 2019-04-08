package tech.veedo.ragdoll;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "veedo.ragdoll")
public class RagdollGlobalAdviceProperties {

    private GlobalAdvice globalAdvice;

    private ExceptionAdvice exceptionAdvice;

    public GlobalAdvice getGlobalAdvice() {
        return globalAdvice;
    }

    public void setGlobalAdvice(GlobalAdvice globalAdvice) {
        this.globalAdvice = globalAdvice;
    }

    public ExceptionAdvice getExceptionAdvice() {
        return exceptionAdvice;
    }

    public void setExceptionAdvice(ExceptionAdvice exceptionAdvice) {
        this.exceptionAdvice = exceptionAdvice;
    }

    public static class GlobalAdvice {

        /**
         * 是否启用
         */
        private Boolean enabled = false;

        /**
         * 不需要使用全局返回结果的方法
         */
        private String ignoreMethods;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }

        public String getIgnoreMethods() {
            return ignoreMethods;
        }

        public void setIgnoreMethods(String ignoreMethods) {
            this.ignoreMethods = ignoreMethods;
        }
    }

    public static class ExceptionAdvice {

        /**
         * 是否启用
         */
        private Boolean enabled = false;

        public Boolean getEnabled() {
            return enabled;
        }

        public void setEnabled(Boolean enabled) {
            this.enabled = enabled;
        }
    }


}
