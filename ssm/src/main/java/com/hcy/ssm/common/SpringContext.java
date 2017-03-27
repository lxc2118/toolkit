package com.hcy.ssm.common;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringContext implements ApplicationContextAware {

	private static ApplicationContext ctx;

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		ctx = context;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> clazz) {
		String name = clazz.getSimpleName();
		return (T) ctx.getBean(name.substring(0, 1).toLowerCase() + name.substring(1));
	}

	public static Object getBean(String beanId) {
		return ctx.getBean(beanId);
	}

	public static void setContext(ApplicationContext context) {
		ctx = context;
	}

}
