package com.fastwebx.db.dao.help;

import com.fastwebx.common.context.S;
import com.fastwebx.common.util.NameUtil;
import com.fastwebx.db.dao.BaseDao;

public class DaoHelp {
	public static void add(Object obj){
		if(obj==null) return;
		getDao(obj).add(obj);
	}
	
	public static int update(Object obj){
		if(obj==null) return 0;
		return getDao(obj).update(obj);
	}
	
	public static int del(Object obj){
		if(obj==null) return 0;
		return getDao(obj).del(obj);
	}
	
	public static void save(Object obj){
		if(obj==null) return;
		getDao(obj).save(obj);
	}
	
	public static <E> E get(Class<E> clazz,Object obj){
		return (E)getDao(clazz).get(obj);
	}
	
	private static BaseDao getDao(Object obj){
		if(obj==null) return null;
		String clazzName = NameUtil.buildName(obj.getClass(), "Dao");
		return (BaseDao)S.get(clazzName);
	}
	
	private static BaseDao getDao(Class clazz){
		if(clazz==null) return null;
		String clazzName = NameUtil.buildName(clazz, "Dao");
		return (BaseDao)S.get(clazzName);
	}
}
