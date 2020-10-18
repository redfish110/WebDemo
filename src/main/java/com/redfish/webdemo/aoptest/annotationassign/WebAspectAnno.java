package com.redfish.webdemo.aoptest.annotationassign;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 切面类
 * @Author :zhaoly
 * @Date 2020/10/18 14:34
 */
@Component
@Aspect
public class WebAspectAnno {
    /**
     * 切入点，使用了该注解的地方会被增强
     * 用注解
     */
    @Pointcut("@annotation(com.redfish.webdemo.aoptest.annotationassign.WebDesc)")
    public void executeAnnotation(){
    }
    @Before("executeAnnotation()")
    public void beforeAdviceAnnotation(){
        System.out.println("- - - - - 前置通知 annotation - - - - -");
    }

    /**
     * @annotation(webDesc)中的webDesc和环绕增强方法的参数(WebDesc webDesc)对应，对使用了webDesc注解的方法进行增强
     *
     * @param proceedingJoinPoint
     * @param webDesc
     * @return
     */
    @Around("@annotation(webDesc)")
    public Object aroundAnnotation(ProceedingJoinPoint proceedingJoinPoint, WebDesc webDesc){
        System.out.println("- - - - - 环绕通知 annotation - - - -");
        //获取注解里的值
        System.out.println("注解的值:" + webDesc.describe());
        try {//obj之前可以写目标方法执行前的逻辑
            Object obj = proceedingJoinPoint.proceed();//调用执行目标方法
            System.out.println("- - - - - 环绕通知 annotation end - - - -");
            return obj;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }
}