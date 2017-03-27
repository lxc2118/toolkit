package com.hcy.ssm.util;

public class NameUtil {
	
	private static NameUtil instance = new NameUtil();
	
	public static NameUtil get(){
		return instance;
	}
	
	private NameUtil(){
		
	}
	
	/**
	 * _分割转为驼峰，第一个字母小写
	 * @param name
	 * @return
	 */
	public String pasical(String name){
		return firstLower(firstUpperPasical(name));
	}
	
	/**
	 * _分割转为驼峰，第一个字母大写
	 * @param name
	 * @return
	 */
	public String firstUpperPasical(String name){
		StringBuffer sb = new StringBuffer();
		String[] names = name.split("_");
		for(String n:names){
			sb.append(firstUpper(n));
		}
		return sb.toString();
	}
	
	/**
	 * 第一个字母大写
	 * @param name
	 * @return
	 */
	public String firstUpper(String name){
		StringBuffer sb = new StringBuffer();
		sb.append(name.substring(0,1).toUpperCase())
			.append(name.substring(1));
		return sb.toString();
	}
	
	/**
	 * 第一个字母小写
	 * @param name
	 * @return
	 */
	public String firstLower(String name){
		StringBuffer sb = new StringBuffer();
		sb.append(name.substring(0,1).toLowerCase())
			.append(name.substring(1));
		return sb.toString();
	}
}
