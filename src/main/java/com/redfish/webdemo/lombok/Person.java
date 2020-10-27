package com.redfish.webdemo.lombok;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author:zhaoly
 * @date :2020/10/20 0:07
 */

@Builder
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class Person {
    private String name;
    private final int age;
    private String email;
    private String address;
    private String password;
}

