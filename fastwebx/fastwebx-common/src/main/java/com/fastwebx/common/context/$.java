package com.fastwebx.common.context;
/**
 * 用s这个类
 * ***************************
 * 创建日期: 2013年9月1日
 * 创建作者：管敏杰
 * 功能：
 ****************************
 */
@Deprecated
public class $ {
	public static  <T> T get(Class<T> clazz){
		return SpringContext.getBean(clazz);
	}
	public static  Object get(String beanId){
		return SpringContext.getBean(beanId);
	}
}
