package com.google.rpcservice.service.impl;

import com.google.rpcapi.UserService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author quanhangbo
 * @date 2022/5/15 21:15
 */
@DubboService // 将这个类提供的方法 对外发布， 将访问的地址ip, 端口, 路径到注册中心
public class UserServiceImpl implements UserService {
	
	@Override
	public String sayHello() {
		return "hello, quanhangbo";
	}
}
