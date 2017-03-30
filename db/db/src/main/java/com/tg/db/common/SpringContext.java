package com.tg.db.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContext implements ApplicationContextAware {

	public void setApplicationContext(ApplicationContext value) throws BeansException {
		ctx = value;
	}

	public static <T> T getBean(Class<T> clazz) {
//		System.out.println(clazz.getName());
//		return (T) ctx.getBean(clazz.getName());
		return ctx.getBean(clazz.getName(),clazz);  
		
//		return (T) ctx.getBean(name.substring(0, 1).toLowerCase() + name.substring(1));
	}

	public static Object getBean(String beanId) {
		return ctx.getBean(beanId);
	}

	public static void setContext(ApplicationContext context) {
		ctx = context;
	}

	private static ApplicationContext ctx;

}
