ragdoll是基于springboot，避免大家重复造轮子，
从而编写出的统一拦截返回数据结构处理和统一异常处理的插件
<br>

> #### 配置项
```yaml
# 根注释
veedo:
  # 统一拦截配置模块
  ragdoll:
    # 统一拦截返回数据结构处理
    global-advice:
      # 是否启用，默认为false
      enabled: true
      # 返回统一拦截的包路径，如果没有，则全局返回
      basePackages: e1.xxx.xxxx(,ex2,ex3...)
      # 不需要使用统一拦截的方法名，多个则用逗号链接
      ignore-methods: example1(,ex2,ex3...)
    # 统一异常处理
    exception-advice:
      # 是否启用，默认为false
      enabled: true
      # 异常打印模式，分为log,stack两种，默认log打印
      mode: stack
```
> #### 统一异常处理
在程序中主动抛出异常的操作:
```java
/**
 * 异常中应该使用GlobalExceptionCode来作为异常代码
 * 错误信息会打印在控制台并返回给前台
 */
public class demo {
    public String demo1() {
        throw new GlobalException();
    }
    
    public String demo2() {
        throw new GlobalException(GlobalExceptionCode.COMMON);
    }
    
    public String demo3() {
        throw new GlobalException("blablabla...");
    }
        
    public String demo4() {
        throw new GlobalException(GlobalExceptionCode.COMMON, "blabla...");
    }
}
```
而程序报错异常，则会自动拦截捕获，打印在控制台并返回给前台