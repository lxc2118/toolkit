package com.fastwebx.valueHolder;

/**
 * 保存sessionid用
 * @author mj
 *
 */
public class JedisSessionContext {

	static private ThreadLocal<String> ids = new ThreadLocal<String>();
	public static String get(){
		return ids.get();
	}
	public static void set(String id){
		ids.set(id);
	}
}
