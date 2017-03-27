package com.fastwebx.db.test;

import junit.framework.TestCase;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestBase extends TestCase{
	
	public TestBase(){
		try{
			new ClassPathXmlApplicationContext("applicationContext.xml");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
