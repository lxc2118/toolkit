package com.fastwebx.property.property;
import java.util.HashMap;

import net.sf.cglib.proxy.Enhancer;

/**
 * ****************************
 * 版权所有：顺网科技 保留所有权利
 * 创建日期: 2011-10-27
 * 创建作者：mj.guan
 * 文件名称：
 * 版本： 1.0
 * 功能：配置类工厂
 * 最后修改时间：
 * 修改记录：
****************************************
 */
public class ProFactory {
	protected static HashMap<String, Object> keepers = new HashMap<String, Object>();
	
	/**
	 * 根据接口返回对象，改对象会读取property文件
	 * @param clazz
	 * @return
	 */
	public  static <T> T getKeeper(Class<T> clazz){
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
        enhancer.setCallback(new ProProxy(clazz));
        return (T)enhancer.create();
	}
}
