package com.chou.springevent.service;

import com.chou.springevent.event.RegisterEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @Author Chou
 * @Description TODO
 * @ClassName RegisterService
 * @Date 2023/4/20 22:43
 * @Version 1.0
 **/
@Service("registerService")
public class RegisterService implements ApplicationEventPublisherAware {

	public ApplicationEventPublisher applicationEventPublisher;

	public void register(String userName){
		// 用户注册成功
		System.out.println(userName + "注册成功");
		applicationEventPublisher.publishEvent(new RegisterEvent(userName));
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
}
