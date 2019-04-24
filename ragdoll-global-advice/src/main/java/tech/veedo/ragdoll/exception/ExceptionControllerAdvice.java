package tech.veedo.ragdoll.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GlobalException.class)
    @ResponseBody
    public ExceptionAdviceEntity globalExceptionHanlder(GlobalException ex) {
        ex.printStackTrace();
        return generateResponseTMP(ex.getErrorCode(), ex.getDetailMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ExceptionAdviceEntity exceptionHanlder(HttpServletRequest request, Throwable ex) {
        ex.printStackTrace();
        HttpStatus status = getStatus(request);
        return generateResponseTMP(status.value(), ex.getMessage());
    }

    private ExceptionAdviceEntity generateResponseTMP(Integer code, String msg) {
        return new ExceptionAdviceEntity()
                .setSuccess(false)
                .setStatusCode(code)
                .setMessage(msg);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }

}
