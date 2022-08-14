package com.chou.service;

import org.springframework.stereotype.Service;

/**
 * @author Axel
 * @version 1.0
 * @className HelleService
 * @description TODO
 * @date 2022/8/14 19:04
 */

@Service("helloSpringService")
public class HelloSpringService {
	public void sayHello(){
		System.out.println("say hello");
	}
}
