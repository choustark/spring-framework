package com.chou.custom.factory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Axel
 * @version 1.0
 * @className BeanFactory
 * @description Bean工厂 方法工厂
 * @date 2022/8/30 23:22
 */

public abstract class MyCustomBeanFactory {
	// map 存储对象
	private final Map<String,Object> mapCache = new ConcurrentHashMap<String,Object>(16);

	// 创建bean 方法
	public abstract Object createBean();

	/**
	 * 根据类型获取对象
	 * @param name
	 * @return
	 */
	public Object getBean(String name){
		return null;
	}

}
