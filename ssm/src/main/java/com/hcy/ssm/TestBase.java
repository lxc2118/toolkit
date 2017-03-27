package com.hcy.ssm;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;


public class TestBase extends TestCase{
	
	public TestBase(){
		try{
			new ClassPathXmlApplicationContext("beans.xml");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
