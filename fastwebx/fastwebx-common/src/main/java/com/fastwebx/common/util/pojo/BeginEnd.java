package com.fastwebx.common.util.pojo;

public class BeginEnd{
	public static final long max = 9999999999999999l;
	private Number begin;
	private Number end;
	public BeginEnd(Number n1,Number n2){
		
		this.begin = n1;
		this.end = n2;
	}
	public Number getBegin() {
		return begin;
	}
	public Number getEnd() {
		return end;
	}
	
	
}


