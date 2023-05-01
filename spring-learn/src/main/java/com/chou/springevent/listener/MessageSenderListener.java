package com.chou.springevent.listener;

import com.chou.springevent.event.RegisterEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Author Chou
 * @Description TODO
 * @ClassName MessageSenderListener
 * @Date 2023/4/20 22:50
 * @Version 1.0
 **/
@Component
public class MessageSenderListener implements ApplicationListener<RegisterEvent> {
	@Override
	public void onApplicationEvent(RegisterEvent event) {
		System.out.printf("监听到了事件。。。。。开始发送app消息");
	}
}
