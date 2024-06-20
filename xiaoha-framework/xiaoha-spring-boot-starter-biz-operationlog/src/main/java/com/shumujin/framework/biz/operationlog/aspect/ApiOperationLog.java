package com.shumujin.framework.biz.operationlog.aspect;

import java.lang.annotation.*;

/**
 * @author: riversome1
 * @date: 2024/6/20 18:25
 * @description: AOP相关自定义注解
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";
}
