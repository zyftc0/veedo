package tech.veedo.ragdoll;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.veedo.ragdoll.exception.ExceptionControllerAdvice;
import tech.veedo.ragdoll.globaladvice.GlobalControllerAdvice;

@Configuration
@EnableConfigurationProperties(RagdollProperties.class)
public class RagdollAutoConfiguration {

    @Autowired
    private RagdollProperties ragdollProperties;

    @Bean
    @ConditionalOnMissingBean(GlobalControllerAdvice.class)
    @ConditionalOnProperty(prefix = "veedo.ragdoll.global-advice", name = "enabled", havingValue = "true")
    public GlobalControllerAdvice generateCommonControllerAdvice() {
        String str = ragdollProperties.getGlobalAdvice().getIgnoreMethods();
        GlobalControllerAdvice advice = new GlobalControllerAdvice(null);
        if (StringUtils.isNotBlank(str)) {
            advice.setIgnoreMethods(str.split(","));
        }
        String basePackages = ragdollProperties.getGlobalAdvice().getBasePackages();
        if (StringUtils.isNotBlank(basePackages)) {
            advice.setBasePackages(basePackages.split(","));
        }
        return advice;
    }

    @Bean
    @ConditionalOnMissingBean(ExceptionControllerAdvice.class)
    @ConditionalOnProperty(prefix = "veedo.ragdoll.exception-advice", name = "enabled", havingValue = "true")
    public ExceptionControllerAdvice generateExceptionControllerAdvice() {
        ExceptionControllerAdvice advice = new ExceptionControllerAdvice();
//        String basePackages = ragdollProperties.getExceptionAdvice().getBasePackages();
//        if (StringUtils.isNotBlank(basePackages)) {
//            advice.setBasePackages(basePackages.split(","));
//        }
        return advice;
    }

}
