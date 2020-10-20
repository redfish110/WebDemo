package com.redfish.webdemo.lombok;

import lombok.*;

/**
 * @description:
 * @author:zhaoly
 * @date :2020/10/20 0:07
 */

@Builder
public class Person {
    private String name;
    private final int age;
    private String email;
    private String address;
    private String password;
}

