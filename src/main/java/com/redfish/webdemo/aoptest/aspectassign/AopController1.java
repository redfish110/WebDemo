package com.redfish.webdemo.aoptest.aspectassign;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author :zhaoly
 * @Date 2020/10/18 14:13
 */
@RestController
@RequestMapping("/aop1")
public class AopController1 {

    @RequestMapping("/test")
    public String testAop(String key){
        return "key="+key;
    }

    @RequestMapping("/testAfterThrowing")
    public String testAfterThrowing(String key){
        throw new NullPointerException();
    }

    @RequestMapping("/testAround")
    public String testAround(String key){
        return "key="+key;
    }
}