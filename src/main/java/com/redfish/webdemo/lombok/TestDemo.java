package com.redfish.webdemo.lombok;

import lombok.Getter;
import lombok.Setter;

/**
 * @description:
 * @author:zhaoly
 * @date :2020/10/20 0:00
 */
@Getter
@Setter
public class TestDemo {

    private String name;

    private int age ; private String email;

    private String address; private String password;
    @Getter @Setter private boolean funny;

}
