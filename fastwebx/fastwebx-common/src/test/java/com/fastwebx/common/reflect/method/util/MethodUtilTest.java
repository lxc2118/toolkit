package com.fastwebx.common.reflect.method.util;

import java.util.Date;

import com.fastwebx.common.reflect.method.util.inf.TGetProcessor;

import junit.framework.TestCase;

public class MethodUtilTest extends TestCase {
	public void testGet(){
		TestObj obj = new TestObj();
		System.out.println(MethodUtil.get(obj, "aaa"));
		System.out.println(MethodUtil.get(obj, "bbb"));
	}
	
	public void testProcessGet(){
		TestObj obj = new TestObj();
		MethodUtil.processGets(obj, new TGetProcessor());
	}
}
class TestObj{
	public String getAaa() {
		return aaa;
	}
	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
	public int getBbb() {
		return bbb;
	}
	public void setBbb(int bbb) {
		this.bbb = bbb;
	}
	public void getCcc(){
		System.out.println("ccccc");
	}
	
	public Date getDdd() {
		return ddd;
	}
	public void setDdd(Date ddd) {
		this.ddd = ddd;
	}

	private String aaa="abc";
	private int bbb=1;
	private Date ddd = new Date();
	
	
}