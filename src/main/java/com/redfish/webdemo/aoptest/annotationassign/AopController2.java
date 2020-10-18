package com.redfish.webdemo.aoptest.annotationassign;

import org.aspectj.lang.annotation.Before;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author :zhaoly
 * @Date 2020/10/18 14:35
 */

@RestController
@RequestMapping("/aop2")
public class AopController2 {
    @RequestMapping("/testAnnotation")
    @WebDesc(describe = "This is testAnnotation Controller")
    @Before("fd")
    public String testAnnotation(String key){
        return "key="+key;
    }
}
