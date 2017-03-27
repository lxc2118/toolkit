package com.fastwebx.common.reflect.hunter;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class SuperClassHunter {
	final static private SuperClassHunter instance = new SuperClassHunter();
	
	static public SuperClassHunter get(){
		return instance;
	}
	
	private SuperClassHunter(){
		
	}
	public Class acqClass(Object obj){
		Class ret = null;
		try {
			Type type = obj.getClass().getGenericSuperclass();
			if(type instanceof ParameterizedType){
				Type[] types = ((ParameterizedType)type).getActualTypeArguments();
				if (types[0] instanceof Class) {
					ret = ((Class) types[0]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
}
