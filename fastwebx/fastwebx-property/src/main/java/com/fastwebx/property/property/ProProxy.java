package com.fastwebx.property.property;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Properties;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public  class ProProxy  implements MethodInterceptor{
	private Class clazz;
	private Properties props = null;
	protected static HashMap<String, Object> prokeepers = new HashMap<String, Object>();
	
	public ProProxy(Class clazz){
		this.clazz = clazz;
	}
	
	@Override
	public Object intercept(Object arg0, Method method, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		Pro pro = method.getAnnotation(Pro.class);
		if(pro != null){
			String key = getKey(method);
			Object ret = prokeepers.get(key);
			if(ret == null){
				Class retType = method.getReturnType();
		
				String name = method.getName();
				ret = parse(this.loadValue(this.getMethodKey(name, pro)),retType,pro);
				
				prokeepers.put(key, ret);
			}
			return ret;
		}
		return null;
	}
	/**
	 * 返回函数的key
	 * @param name
	 * @param pro
	 * @return
	 */
	protected String getMethodKey(String name,Pro pro){
		if(pro != null && !pro.field().equals(""))
			return pro.field();
		if(name != null && name.startsWith("get"))
			return name.substring(3,4).toLowerCase()+name.substring(4);
		return name;
	}
	/**
	 * 取值
	 * @param key
	 * @return
	 */
	protected String loadValue(String key){
		if(props == null){
			props = new Properties();
        	InputStream in = ProContext.getStream(clazz);
        	try {
				props.load(in);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return props.getProperty(key);
	}
	
	/**
	 * 读取key
	 * @param method
	 * @return
	 */
	protected String getKey(Method method){
		StringBuffer sb = new StringBuffer();
		sb.append(clazz.getName());
		sb.append("_");
		sb.append(method.getName());
		return sb.toString();
	}
	/**
	 * 将从property文件中读取的字符串转化成对应的值
	 * @param value
	 * @param clazz
	 * @param pro
	 * @return
	 */
	protected Object parse(String value,Class clazz,Pro pro){
		if(value==null)  
			value = pro.defaultValue();
		if(clazz != null){
			if(clazz.equals(Integer.class)){
				return Integer.parseInt(value);
			}
			if(clazz.equals(Double.class)){
				return Double.parseDouble(value);
			}
			if(clazz.equals(Float.class)){
				return Float.parseFloat(value);
			}
			if(clazz.equals(Long.class)){
				return Long.parseLong(value);
			}
			
			if(clazz.equals(int.class)){
				return Integer.parseInt(value);
			}
			if(clazz.equals(double.class)){
				return Double.parseDouble(value);
			}
			if(clazz.equals(float.class)){
				return Float.parseFloat(value);
			}
			if(clazz.equals(long.class)){
				return Long.parseLong(value);
			}
			
			if(clazz.equals(Date.class)){
				String str = "yyyy-MM-dd";
				if(pro!=null && !pro.dateFormat().equals("")){
					str = pro.dateFormat();
				}
				SimpleDateFormat format = new SimpleDateFormat(str); 
				Date ret = null;
				try {
					ret = format.parse(value);
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return ret;
			}
		}
		return value;
	}
	
}
