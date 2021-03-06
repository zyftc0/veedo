package tech.veedo.ragdoll.globaladvice;

import com.alibaba.fastjson.JSON;
import lombok.Data;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import tech.veedo.ragdoll.exception.ExceptionAdviceEntity;

import java.lang.reflect.Member;
import java.util.Arrays;
import java.util.Map;

@Data
@RestControllerAdvice
public class GlobalControllerAdvice implements ResponseBodyAdvice {

    private String[] ignoreMethods;

    private String[] basePackages;

    public GlobalControllerAdvice(String[] ignoreMethods) {
        this.ignoreMethods = ignoreMethods;
    }

    /**
     * Whether this component supports the given controller method return type
     * and the selected {@code HttpMessageConverter} type.
     *
     * @param returnType    the return type
     * @param converterType the selected converter type
     * @return {@code true} if {@link #beforeBodyWrite} should be invoked;
     * {@code false} otherwise
     */
    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        Member m = returnType.getMember();
        if (basePackages != null && basePackages.length > 0) {
            String classPath = m.getDeclaringClass().getPackage().getName();
            return Arrays.stream(this.basePackages)
                    .anyMatch((basePackage) -> basePackage.equals(classPath)) ? this.ignore(m) : false;
        } else {
            return ignore(m);
        }
    }

    private boolean ignore(Member m) {
        if (ignoreMethods != null && ignoreMethods.length > 0) {
            String methodName = m.getName();
            return !Arrays.stream(this.ignoreMethods).anyMatch((ignoreMethod) -> ignoreMethod.equals(methodName));
        } else {
            return true;
        }
    }

    /**
     * Invoked after an {@code HttpMessageConverter} is selected and just before
     * its write method is invoked.
     *
     * @param body                  the body to be written
     * @param returnType            the return type of the controller method
     * @param selectedContentType   the content type selected through content negotiation
     * @param selectedConverterType the converter type selected to write to the response
     * @param request               the current request
     * @param response              the current response
     * @return the body that was passed in or a modified (possibly new) instance
     */
    @Override
    public Object beforeBodyWrite(Object body,
                                  MethodParameter returnType,
                                  MediaType selectedContentType,
                                  Class selectedConverterType,
                                  ServerHttpRequest request,
                                  ServerHttpResponse response) {

        if (!(body instanceof GlobalAdviceEntity || body instanceof ExceptionAdviceEntity)) {
            if (body == null) {
                return new GlobalAdviceEntity();
            }
            if (body instanceof String) {
                return JSON.toJSONString(new GlobalAdviceEntity().setData(body));
            }
            if (body instanceof Boolean) {
                return new GlobalAdviceEntity().setSuccess((Boolean) body);
            }
            return new GlobalAdviceEntity().setData(body);
        }

        return body;
    }
}
