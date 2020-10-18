package com.redfish.webdemo.aoptest.annotationassign;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 使用该注解的地方会被增强
 * @Author :zhaoly
 * @Date 2020/10/18 14:33
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface WebDesc {
    String describe() default "mydesc";
}
