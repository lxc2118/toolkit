package com.fastwebx.property.dbproperty;

import java.sql.Connection;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;



import com.fastwebx.property.dbproperty.DbProperty;

import junit.framework.TestCase;

public class DbProProxyTest extends TestCase {
	
	@Override
	protected void setUp() throws Exception {
		System.out.println("111111111111");
		new ClassPathXmlApplicationContext("testProperty.xml");
	}

	public void testGet(){
		TestPojo pojo = DbProperty.get(TestPojo.class);
		Date date = new Date();
		for(int i=0;i<100;i++){
			pojo.getUploadPath();
		}
		System.out.println(new Date().getTime()-date.getTime());
		System.out.println(pojo.getContext());
		System.out.println(pojo.getTest2());
	}
	
	public void testGet2(){
		TestPojo pojo = DbProperty.get(TestPojo.class);
		System.out.println(pojo.getCreateDate());
		System.out.println(pojo.getContext());
		System.out.println(pojo.getTestValue());
		pojo.setCreateDate(new Date(new Date().getTime()+3600l*1000l*24*2));
		
		pojo.save();
		
		System.out.println(pojo.getCreateDate());
	}
	
	public void testsave(){
		TestPojo pojo = DbProperty.get(TestPojo.class);
		pojo.setContext("test1");
		pojo.setCreateDate(new Date(new Date().getTime()+3600l*1000l*24));
		pojo.save();
		
	}
	public void testGetNum(){
		TestPojo pojo = DbProperty.get(TestPojo.class);
		System.out.println(pojo.getTest1());
		System.out.println(pojo.getTest2());
		pojo.setTest2(4l);
		pojo.save();
		System.out.println(pojo.getTest2());
	}
}
