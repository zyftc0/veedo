package tech.veedo.ragdoll.exception;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestControllerAdvice
public class ExceptionControllerAdvice extends ResponseEntityExceptionHandler {

    @Getter
    @Setter
    private String mode;

    @ExceptionHandler(GlobalException.class)
    @ResponseBody
    public ExceptionAdviceEntity globalExceptionHanlder(GlobalException ex) {
        showError(ex);
        return generateResponseTMPWithData(ex.getErrorCode(), ex.getMessage(), ex.getData());
    }

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public ExceptionAdviceEntity arithmeticExceptionHanlder(ArithmeticException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ARITHMETIC.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ARITHMETIC.getMessage():ex.getMessage());
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    @ResponseBody
    public ExceptionAdviceEntity arrayIndexOutOfBoundsExceptionHanlder(ArrayIndexOutOfBoundsException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ARRAY_INDEX_OUT_OF_BOUNDS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ARRAY_INDEX_OUT_OF_BOUNDS.getMessage():ex.getMessage());
    }

    @ExceptionHandler(ArrayStoreException.class)
    @ResponseBody
    public ExceptionAdviceEntity arrayStoreExceptionHanlder(ArrayStoreException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ARRAY_STORE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ARRAY_STORE.getMessage():ex.getMessage());
    }

    @ExceptionHandler(ClassCastException.class)
    @ResponseBody
    public ExceptionAdviceEntity classCastExceptionHanlder(ClassCastException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.CLASS_CAST.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.CLASS_CAST.getMessage():ex.getMessage());
    }

    @ExceptionHandler(ClassNotFoundException.class)
    @ResponseBody
    public ExceptionAdviceEntity classNotFoundExceptionHanlder(ClassNotFoundException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.CLASS_NOT_FOUND.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.CLASS_NOT_FOUND.getMessage():ex.getMessage());
    }

    @ExceptionHandler(CloneNotSupportedException.class)
    @ResponseBody
    public ExceptionAdviceEntity cloneNotSupportedExceptionHanlder(CloneNotSupportedException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.CLONE_NOT_SUPPORTED.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.CLONE_NOT_SUPPORTED.getMessage():ex.getMessage());
    }

    @ExceptionHandler(EnumConstantNotPresentException.class)
    @ResponseBody
    public ExceptionAdviceEntity enumConstantNotPresentExceptionHanlder(EnumConstantNotPresentException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ENUM_CONSTANT_NOT_PRESENT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ENUM_CONSTANT_NOT_PRESENT.getMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalAccessException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalAccessExceptionHanlder(IllegalAccessException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_ACCESS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_ACCESS.getMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalArgumentExceptionHanlder(IllegalArgumentException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_ARGUMENT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_ARGUMENT.getMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalMonitorStateException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalMonitorStateExceptionHanlder(IllegalMonitorStateException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_MONITOR.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_MONITOR.getMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalStateException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalStateExceptionHanlder(IllegalStateException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_STATE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_STATE.getMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalThreadStateException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalThreadStateExceptionHanlder(IllegalThreadStateException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_THREAD_STATE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_THREAD_STATE.getMessage():ex.getMessage());
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseBody
    public ExceptionAdviceEntity indexOutOfBoundsExceptionHanlder(IndexOutOfBoundsException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.INDEX_OUT_OF_BOUNDS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.INDEX_OUT_OF_BOUNDS.getMessage():ex.getMessage());
    }

    @ExceptionHandler(InstantiationException.class)
    @ResponseBody
    public ExceptionAdviceEntity instantiationExceptionHanlder(InstantiationException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.INSTANTIATION.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.INSTANTIATION.getMessage():ex.getMessage());
    }

    @ExceptionHandler(InterruptedException.class)
    @ResponseBody
    public ExceptionAdviceEntity interruptedExceptionHanlder(InterruptedException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.INTERRUPTED.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.INTERRUPTED.getMessage():ex.getMessage());
    }

    @ExceptionHandler(NegativeArraySizeException.class)
    @ResponseBody
    public ExceptionAdviceEntity negativeArraySizeExceptionHanlder(NegativeArraySizeException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.NEGATIVE_ARRAY_SIZE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NEGATIVE_ARRAY_SIZE.getMessage():ex.getMessage());
    }

    @ExceptionHandler(NoSuchFieldException.class)
    @ResponseBody
    public ExceptionAdviceEntity noSuchFieldExceptionnHanlder(NoSuchFieldException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.NO_SUCH_FIELD.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NO_SUCH_FIELD.getMessage():ex.getMessage());
    }

    @ExceptionHandler(NoSuchMethodException.class)
    @ResponseBody
    public ExceptionAdviceEntity noSuchMethodExceptionHanlder(NoSuchMethodException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.NO_SUCH_METHOD.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NO_SUCH_METHOD.getMessage():ex.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ExceptionAdviceEntity nullPointerExceptionHanlder(HttpServletRequest request, NullPointerException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.NULL_POINTER.getErrorCode(), ex.getMessage());
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseBody
    public ExceptionAdviceEntity numberFormatExceptionHanlder(NumberFormatException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.NUMBER_FORMAT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NUMBER_FORMAT.getMessage():ex.getMessage());
    }

    @ExceptionHandler(ReflectiveOperationException.class)
    @ResponseBody
    public ExceptionAdviceEntity reflectiveOperationExceptionHanlder(ReflectiveOperationException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.REFLECTIVE_OPERATION.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.REFLECTIVE_OPERATION.getMessage():ex.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ExceptionAdviceEntity runtimeExceptionHanlder(RuntimeException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.RUNTIME.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.RUNTIME.getMessage():ex.getMessage());
    }

    @ExceptionHandler(SecurityException.class)
    @ResponseBody
    public ExceptionAdviceEntity securityExceptionHanlder(SecurityException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.SECURITY.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.SECURITY.getMessage():ex.getMessage());
    }

    @ExceptionHandler(StringIndexOutOfBoundsException.class)
    @ResponseBody
    public ExceptionAdviceEntity stringIndexOutOfBoundsExceptionHanlder(StringIndexOutOfBoundsException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.STRING_INDEX_OUT_OF_BOUNDS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.STRING_INDEX_OUT_OF_BOUNDS.getMessage():ex.getMessage());
    }

    @ExceptionHandler(TypeNotPresentException.class)
    @ResponseBody
    public ExceptionAdviceEntity typeNotPresentExceptionHanlder(TypeNotPresentException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.TYPE_NOT_PRESENT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.TYPE_NOT_PRESENT.getMessage():ex.getMessage());
    }

    @ExceptionHandler(UnsupportedOperationException.class)
    @ResponseBody
    public ExceptionAdviceEntity unsupportedOperationExceptionHanlder(UnsupportedOperationException ex) {
        showError(ex);
        return generateResponseTMP(GlobalExceptionCode.UNSUPPORTED_OPERATION.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.UNSUPPORTED_OPERATION.getMessage():ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ExceptionAdviceEntity exceptionHanlder(HttpServletRequest request, Throwable ex) {
        showError(ex);
        HttpStatus status = getStatus(request);
        return generateResponseTMP(status.value(), ex.getMessage());
    }

    private ExceptionAdviceEntity generateResponseTMP(Integer code, String msg) {
        return new ExceptionAdviceEntity()
                .setErrorCode(code)
                .setMessage(msg);
    }

    private ExceptionAdviceEntity generateResponseTMPWithData(Integer code, String msg, Object data) {
        return new ExceptionAdviceEntity()
                .setErrorCode(code)
                .setMessage(msg)
                .setData(data);
    }

    private HttpStatus getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return HttpStatus.INTERNAL_SERVER_ERROR;
        }
        return HttpStatus.valueOf(statusCode);
    }

    private void showError(Throwable e) {
        switch (Mode.getMode(mode)) {
            case STACK:
                e.printStackTrace();
                break;
            default:
                log.error(e.getMessage());
                break;
        }
    }

}
