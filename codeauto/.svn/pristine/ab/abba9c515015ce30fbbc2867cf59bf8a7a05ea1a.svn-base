package com.fastwebx.codeAuto.javaType;

import java.util.HashMap;


public class JavaTypeExchanger {
	private static HashMap<String, JavaType> types = new HashMap<String,JavaType>();
	static{
		types.put("varchar", new JavaString());
		types.put("int", new JavaInteger());
		types.put("integer",  new JavaInteger());
		types.put("date", new JavaDate());
		types.put("timestamp", new JavaDate());
		types.put("smalldatetime", new JavaDate());
		types.put("bit", new JavaBoolean());
		types.put("int identity",  new JavaInteger());
		types.put("text", new JavaString());
		types.put("INT UNSIGNED",  new JavaInteger());
		types.put("datetime", new JavaDate());
		types.put("tinyint",  new JavaInteger());
		types.put("tinyint unsigned",  new JavaInteger());
		types.put("bigint", new JavaLong());
		types.put("char", new JavaString());
		types.put("float", new JavaFloat());
		types.put("double", new JavaDouble());
	}
	public static JavaType getJavaType(String key){
		key = key.toLowerCase();
		if(key.indexOf(" ")>-1)
			key = key.substring(0,key.indexOf(" "));
		JavaType ret = types.get(key);
		if(ret==null){
			ret = new JavaString();
		}
		return ret;
	}
}
