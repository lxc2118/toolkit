package com.tg.db;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class TestBase extends TestCase {

	protected static ApplicationContext ac;

	public TestBase() {
		try {
			ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
