package com.fastwebx.web.util;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.function.Supplier;



public class JsonHelpUtil {
	public static JsonHelpObj put(String key,Object obj){
		JsonHelpObj jho = new JsonHelpObj();
		jho.put(key, obj); 
		return jho;
	}
	
	public static JsonHelpObj putDate(String key,Date obj){
		JsonHelpObj jho = new JsonHelpObj();
		
		jho.putDate(key, obj);
		return jho;
	}
	
	public static JsonHelpObj putIfExist(String key,Object obj,Supplier s){
		JsonHelpObj jho = new JsonHelpObj();
		jho.putIfExist(key, obj,s);
		return jho;
	}

	public static JsonHelpObj  putArray(String key, Collection array) {
		JsonHelpObj jho = new JsonHelpObj();
		jho.putArray(key, array);
		return jho;
	}
	
	
}
