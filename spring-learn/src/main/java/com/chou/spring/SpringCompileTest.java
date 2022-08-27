package com.chou.spring;

import com.chou.spring.service.HelloSpringService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Axel
 * @version 1.0
 * @className SpringCompileTest
 * @description TODO
 * @date 2022/8/14 19:03
 */

public class SpringCompileTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(HelloSpringService.class);
		HelloSpringService acBean = ac.getBean(HelloSpringService.class);
		acBean.sayHello();
	}
}
