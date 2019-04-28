package tech.veedo.ragdoll;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tech.veedo.ragdoll.exception.ExceptionControllerAdvice;
import tech.veedo.ragdoll.globaladvice.GlobalControllerAdvice;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

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
        return returnAdivce(advice, basePackages);
    }

    @Bean
    @ConditionalOnMissingBean(ExceptionControllerAdvice.class)
    @ConditionalOnProperty(prefix = "veedo.ragdoll.exception-advice", name = "enabled", havingValue = "true")
    public ExceptionControllerAdvice generateExceptionControllerAdvice() {
        ExceptionControllerAdvice advice = new ExceptionControllerAdvice();
        String basePackages = ragdollProperties.getExceptionAdvice().getBasePackages();
        return returnAdivce(advice, basePackages);
    }

    /**
     * 把扫描路径加入Advice中
     * @param advice
     * @param basePackages
     * @param <T>
     * @return
     */
    private <T> T returnAdivce(T advice, String basePackages) {
        if (StringUtils.isNotBlank(basePackages)) {
            Annotation annotation = advice.getClass().getAnnotation(RestControllerAdvice.class);
            try {
                setAnnotationValue(annotation, "basePackages", basePackages);
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return advice;
    }

    /**
     * 设置注解中的字段值
     *
     * @param annotation 要修改的注解实例
     * @param fieldName  要修改的注解字段名
     * @param value      要设置的值
     */
    private void setAnnotationValue(Annotation annotation, String fieldName, Object value) throws NoSuchFieldException, IllegalAccessException {
        InvocationHandler handler = Proxy.getInvocationHandler(annotation);
        Field hField = handler.getClass().getDeclaredField("memberValues");
        hField.setAccessible(true);
        Map memberValues = (Map) hField.get(handler);
        memberValues.put(fieldName, value);
    }

}
