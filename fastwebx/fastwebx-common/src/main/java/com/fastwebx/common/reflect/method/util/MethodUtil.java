package com.fastwebx.common.reflect.method.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.fastwebx.common.reflect.method.GetMethodFilter;
import com.fastwebx.common.reflect.method.util.processor.IGeterProcessor;
import com.fastwebx.common.util.StrUtil;

public class MethodUtil {
	private static GetMethodFilter getMethodFilter = new GetMethodFilter();
	/**
	 * 
	 * @param obj
	 * @param processor
	 */
	public static void processGets(Object obj,IGeterProcessor processor){
		if(obj==null || processor==null) return ;
		for(Method method:obj.getClass().getMethods()){
			String methodName = method.getName();
			if(getMethodFilter.filte(method, methodName) && methodName.length()>3){
				String name = methodName.substring(3,4).toLowerCase();
				if(methodName.length()>4){
					name = StrUtil.join(name,methodName.substring(4));
				}
				try {
					processor.process(name, method.invoke(obj));
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static Object get(Object object,String name){
		if(object==null || name==null) return null;
		Method method = getMethod(object.getClass(),buildMethodName("get", name));
		try {
			return method.invoke(object);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static String buildMethodName(String prefix,String name){
		StringBuffer sb = new StringBuffer();
		sb.append(prefix);
		sb.append(name.substring(0,1).toUpperCase());
		sb.append(name.substring(1));
		return sb.toString();
	}
	
	public static Method getMethod(Class clazz,String name,Class... paramClazzs){
		try {
			return clazz.getMethod(name, paramClazzs);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		return null;
	} 
}
