package com.google.rpcweb.rpcweb.controller;

import com.google.rpcapi.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author quanhangbo
 * @date 2022/5/15 21:17
 */
@DubboComponentScan("com.google.rpcservice")
@RestController
@RequestMapping("/user")
public class UserController {
	
	@DubboReference
	UserService userService;
	
	@RequestMapping("/hello")
	public String sayHello(){
		return userService.sayHello();
	}
}
