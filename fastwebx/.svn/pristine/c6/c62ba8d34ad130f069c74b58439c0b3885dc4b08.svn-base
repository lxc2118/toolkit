package com.fastwebx.property.dbproperty;

import java.util.HashMap;

import net.sf.cglib.proxy.Enhancer;


public class DbProperty {
	protected static HashMap<String, Object> keepers = new HashMap<String, Object>();
	
	/**
	 * 根据接口返回对象，改对象会读取property文件
	 * @param clazz
	 * @return
	 */
	public  static <T> T get(Class<T> clazz){
		if(clazz != null){
			String name = clazz.getName();
			Object ret = keepers.get(name);
			if(ret == null){
				ret = createKeeper(clazz);
				keepers.put(name, ret);
			}
			return (T)ret;
		}
		return null;
	} 
	/**
	 * 创建keep
	 * @param clazz
	 * @return
	 */
	protected static <T> T createKeeper(Class<T> clazz){
		Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(new DbProxy(clazz));
        return (T)enhancer.create();
	}
}
