package com.fastwebx.common.conf;

import java.util.concurrent.ConcurrentMap;

/**
 * 配置工厂类
 * @author mj
 */
public class ConfFac {
	private static ConcurrentMap<Class, Object> map = new java.util.concurrent.ConcurrentHashMap<>();
	public static <T> T get(Class<T> clazz){
		return (T)map.computeIfAbsent(clazz, (key)->{ return build(key);});
	}
	
	public static <T> void put(Class<T> clazz,T t){
		if(clazz!=null && t!=null){
			map.put(clazz, t);
		}
	}
	
	private static <T> T build(Class<T> clazz){
		try {
			return clazz.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
		
	}
}