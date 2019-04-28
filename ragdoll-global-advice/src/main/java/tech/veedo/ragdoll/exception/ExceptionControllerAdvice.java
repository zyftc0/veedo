package tech.veedo.ragdoll.exception;

import org.apache.commons.lang3.StringUtils;
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

    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public ExceptionAdviceEntity arithmeticExceptionHanlder(ArithmeticException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ARITHMETIC.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ARITHMETIC.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    @ResponseBody
    public ExceptionAdviceEntity arrayIndexOutOfBoundsExceptionHanlder(ArrayIndexOutOfBoundsException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ARRAY_INDEX_OUT_OF_BOUNDS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ARRAY_INDEX_OUT_OF_BOUNDS.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(ArrayStoreException.class)
    @ResponseBody
    public ExceptionAdviceEntity arrayStoreExceptionHanlder(ArrayStoreException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ARRAY_STORE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ARRAY_STORE.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(ClassCastException.class)
    @ResponseBody
    public ExceptionAdviceEntity classCastExceptionHanlder(ClassCastException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.CLASS_CAST.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.CLASS_CAST.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(ClassNotFoundException.class)
    @ResponseBody
    public ExceptionAdviceEntity classNotFoundExceptionHanlder(ClassNotFoundException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.CLASS_NOT_FOUND.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.CLASS_NOT_FOUND.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(CloneNotSupportedException.class)
    @ResponseBody
    public ExceptionAdviceEntity cloneNotSupportedExceptionHanlder(CloneNotSupportedException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.CLONE_NOT_SUPPORTED.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.CLONE_NOT_SUPPORTED.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(EnumConstantNotPresentException.class)
    @ResponseBody
    public ExceptionAdviceEntity enumConstantNotPresentExceptionHanlder(EnumConstantNotPresentException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ENUM_CONSTANT_NOT_PRESENT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ENUM_CONSTANT_NOT_PRESENT.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalAccessException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalAccessExceptionHanlder(IllegalAccessException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_ACCESS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_ACCESS.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalArgumentExceptionHanlder(IllegalArgumentException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_ARGUMENT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_ARGUMENT.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalMonitorStateException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalMonitorStateExceptionHanlder(IllegalMonitorStateException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_MONITOR.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_MONITOR.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalStateException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalStateExceptionHanlder(IllegalStateException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_STATE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_STATE.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(IllegalThreadStateException.class)
    @ResponseBody
    public ExceptionAdviceEntity illegalThreadStateExceptionHanlder(IllegalThreadStateException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.ILLEGAL_THREAD_STATE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.ILLEGAL_THREAD_STATE.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    @ResponseBody
    public ExceptionAdviceEntity indexOutOfBoundsExceptionHanlder(IndexOutOfBoundsException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.INDEX_OUT_OF_BOUNDS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.INDEX_OUT_OF_BOUNDS.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(InstantiationException.class)
    @ResponseBody
    public ExceptionAdviceEntity instantiationExceptionHanlder(InstantiationException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.INSTANTIATION.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.INSTANTIATION.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(InterruptedException.class)
    @ResponseBody
    public ExceptionAdviceEntity interruptedExceptionHanlder(InterruptedException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.INTERRUPTED.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.INTERRUPTED.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(NegativeArraySizeException.class)
    @ResponseBody
    public ExceptionAdviceEntity negativeArraySizeExceptionHanlder(NegativeArraySizeException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.NEGATIVE_ARRAY_SIZE.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NEGATIVE_ARRAY_SIZE.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(NoSuchFieldException.class)
    @ResponseBody
    public ExceptionAdviceEntity noSuchFieldExceptionnHanlder(NoSuchFieldException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.NO_SUCH_FIELD.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NO_SUCH_FIELD.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(NoSuchMethodException.class)
    @ResponseBody
    public ExceptionAdviceEntity noSuchMethodExceptionHanlder(NoSuchMethodException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.NO_SUCH_METHOD.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NO_SUCH_METHOD.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ExceptionAdviceEntity nullPointerExceptionHanlder(HttpServletRequest request, NullPointerException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.NULL_POINTER.getErrorCode(), ex.getMessage());
    }

    @ExceptionHandler(NumberFormatException.class)
    @ResponseBody
    public ExceptionAdviceEntity numberFormatExceptionHanlder(NumberFormatException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.NUMBER_FORMAT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.NUMBER_FORMAT.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(ReflectiveOperationException.class)
    @ResponseBody
    public ExceptionAdviceEntity reflectiveOperationExceptionHanlder(ReflectiveOperationException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.REFLECTIVE_OPERATION.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.REFLECTIVE_OPERATION.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public ExceptionAdviceEntity runtimeExceptionHanlder(RuntimeException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.RUNTIME.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.RUNTIME.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(SecurityException.class)
    @ResponseBody
    public ExceptionAdviceEntity securityExceptionHanlder(SecurityException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.SECURITY.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.SECURITY.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(StringIndexOutOfBoundsException.class)
    @ResponseBody
    public ExceptionAdviceEntity stringIndexOutOfBoundsExceptionHanlder(StringIndexOutOfBoundsException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.STRING_INDEX_OUT_OF_BOUNDS.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.STRING_INDEX_OUT_OF_BOUNDS.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(TypeNotPresentException.class)
    @ResponseBody
    public ExceptionAdviceEntity typeNotPresentExceptionHanlder(TypeNotPresentException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.TYPE_NOT_PRESENT.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.TYPE_NOT_PRESENT.getDetailMessage():ex.getMessage());
    }

    @ExceptionHandler(UnsupportedOperationException.class)
    @ResponseBody
    public ExceptionAdviceEntity unsupportedOperationExceptionHanlder(UnsupportedOperationException ex) {
        ex.printStackTrace();
        return generateResponseTMP(GlobalExceptionCode.UNSUPPORTED_OPERATION.getErrorCode(),
                StringUtils.isBlank(ex.getMessage())?GlobalExceptionCode.UNSUPPORTED_OPERATION.getDetailMessage():ex.getMessage());
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
