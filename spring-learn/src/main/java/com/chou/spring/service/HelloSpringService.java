package com.chou.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author Axel
 * @version 1.0
 * @className HelleService
 * @description Spring源码编译测试类...
 * @date 2022/8/14 19:04
 */
@Service("helloSpringService")
public class HelloSpringService {
	public void sayHello(){
		System.out.println("say hello");
	}
}
