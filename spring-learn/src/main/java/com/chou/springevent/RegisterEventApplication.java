package com.chou.springevent;

import com.chou.springevent.service.RegisterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author Chou
 * @Description TODO
 * @ClassName RegisterEventApplication
 * @Date 2023/4/20 22:38
 * @Version 1.0
 **/
public class RegisterEventApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("com.chou.springevent");
		RegisterService service = ctx.getBean(RegisterService.class);
		service.register("Chou");
	}
}
