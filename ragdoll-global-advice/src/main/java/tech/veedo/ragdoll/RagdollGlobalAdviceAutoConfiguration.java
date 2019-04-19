package tech.veedo.ragdoll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.veedo.ragdoll.exception.ExceptionControllerAdvice;
import tech.veedo.ragdoll.globaladvice.GlobalControllerAdvice;

@Configuration
@EnableConfigurationProperties(RagdollGlobalAdviceProperties.class)
public class RagdollGlobalAdviceAutoConfiguration {

    @Autowired
    private RagdollGlobalAdviceProperties ragdollGlobalAdviceProperties;

    @Bean
    @ConditionalOnMissingBean(GlobalControllerAdvice.class)
    @ConditionalOnProperty(prefix = "veedo.ragdoll.global-advice", name = "enabled", havingValue = "true")
    public GlobalControllerAdvice generateCommonControllerAdvice() {
        String str = ragdollGlobalAdviceProperties.getGlobalAdvice().getIgnoreMethods();
        if (str == null || str == "") {
            return new GlobalControllerAdvice(null);
        } else {
            String[] ignoreMethods = str.split(",");
            return new GlobalControllerAdvice(ignoreMethods);
        }
    }

    @Bean
    @ConditionalOnMissingBean(ExceptionControllerAdvice.class)
    @ConditionalOnProperty(prefix = "veedo.ragdoll.exception-advice", name = "enabled", havingValue = "true")
    public ExceptionControllerAdvice generateExceptionControllerAdvice() {
        return new ExceptionControllerAdvice();
    }

}
