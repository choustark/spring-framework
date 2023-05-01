package com.chou.springevent.event;

import org.springframework.context.ApplicationEvent;

import java.io.Serializable;

/**
 * @Author Chou
 * @Description TODO
 * @ClassName RegisterEnvent
 * @Date 2023/4/20 22:39
 * @Version 1.0
 **/
public class RegisterEvent extends ApplicationEvent implements Serializable {
	public static final long serialVersionUID = -1L;


	public RegisterEvent(Object source) {
		super(source);
	}
}
