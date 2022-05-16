package com.google.rpcweb.rpcweb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
@SpringBootApplication
public class RpcWebApplication {

	public static void main(String[] args) {
	SpringApplication.run(RpcWebApplication.class, args);
}

}
