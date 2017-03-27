package com.fastwebx.common.reflect.valueTrans.imp;

import java.util.Date;

import junit.framework.TestCase;

public class DateTransTest extends TestCase {
	public void testToStr(){
		DateTrans trans = new DateTrans();
		System.out.println(trans.toStr(new Date()));
	}
	
	public void testToDouble(){
		DateTrans trans = new DateTrans();
		Date d = (trans.toObj("2001-1-5"));
		System.out.println("d="+d);
	}
}
