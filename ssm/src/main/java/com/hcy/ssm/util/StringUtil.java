package com.hcy.ssm.util;

public class StringUtil {
	private static StringUtil instance = new StringUtil();
	public static StringUtil get(){
		return instance;
	}
	private StringUtil(){
		
	}
	public String s(String s){
		return s;
	}
}
