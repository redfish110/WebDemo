package com.redfish.webdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WebdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdemoApplication.class, args);
	}

	@GetMapping
	public String mainPath(){
		String projectPath = "<p><a href='https://github.com/redfish110?tab=repositories' target='_Blank'>我的项目</a></p>";
		String blogPath = "<p><a href='https://blog.csdn.net/weixin_39661670' target='_Blank'>相关博客</a></p>";
		return projectPath + blogPath;
	}

}
