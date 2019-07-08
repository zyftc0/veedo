package tech.veedo.ragdoll.exception;

import lombok.Getter;

@Getter
public enum GlobalExceptionCode {

    COMMON(300, "统一标准异常"),
    ARITHMETIC(301, "运算异常"),
    ARRAY_INDEX_OUT_OF_BOUNDS(302, "索引超出边界"),
    ARRAY_STORE(303, "数组存储对象类型不正确"),
    CLASS_CAST(304, "类转换异常"),
    CLASS_NOT_FOUND(305, "未找到class"),
    CLONE_NOT_SUPPORTED(306, "对象不能被克隆"),
    ENUM_CONSTANT_NOT_PRESENT(307, "枚举常量不存在"),
    ILLEGAL_ACCESS(308, "没有访问权限"),
    ILLEGAL_ARGUMENT(309, "参数不合法"),
    ILLEGAL_MONITOR(310, "当前的线程不是此对象锁的所有者，却调用该对象的notify()，notify()，wait()等方法"),
    ILLEGAL_STATE(311, "表示在非法或不适当的时间调用了方法"),
    ILLEGAL_THREAD_STATE(312, "抛出以指示线程未处于所请求操作的适当状态"),
    INDEX_OUT_OF_BOUNDS(313, "下标越界"),
    INSTANTIATION(314, "不能实例化对象"),
    INTERRUPTED(315, "线程不能二次阻塞"),
    NEGATIVE_ARRAY_SIZE(316, "数组大小为负"),
    NO_SUCH_FIELD(317, "没有找到该属性"),
    NO_SUCH_METHOD(318, "没有找到该方法"),
    NULL_POINTER(319, "空指针异常"),
    NUMBER_FORMAT(320, "数字解析异常"),
    REFLECTIVE_OPERATION(321, "核心反射中反射操作抛出的常见超类异常"),
    RUNTIME(322, "运行时异常"),
    SECURITY(323, "安全违规"),
    STRING_INDEX_OUT_OF_BOUNDS(324, "字符串下标越界"),
    TYPE_NOT_PRESENT(325, "要获取的类型未提供"),
    UNSUPPORTED_OPERATION(326, "不支持的操作"),
    ;

    private Integer errorCode;

    private String message;

    GlobalExceptionCode(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

}
