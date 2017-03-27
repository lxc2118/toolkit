package com.fastwebx.common.reflect.valueTrans.imp;

import junit.framework.TestCase;

public class DoubleTranserTest extends TestCase {
	public void testToStr(){
		DoubleTrans trans = new DoubleTrans();
		System.out.println(trans.toStr(10002356.12345d));
	}
	
	public void testToDouble(){
		DoubleTrans trans = new DoubleTrans();
		double d = (trans.toObj("10002356.12345d"));
		System.out.println("d="+d);
	}
}
