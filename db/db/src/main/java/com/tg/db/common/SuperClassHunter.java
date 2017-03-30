package com.tg.db.common;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class SuperClassHunter {

	final static private SuperClassHunter instance = new SuperClassHunter();

	static public SuperClassHunter get() {
		return instance;
	}

	private SuperClassHunter() {

	}

	public Class acqClass(Object obj) {
		Class ret = null;
		try {
			Type type = obj.getClass().getGenericSuperclass();
			if (type instanceof ParameterizedType) {
				Type[] types = ((ParameterizedType) type).getActualTypeArguments();
				if (types[0] instanceof Class) {
					ret = ((Class) types[0]);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
	
	public List<Class> acqClasses(Object obj) {
		List<Class> ret = new ArrayList<Class>();
		try {
			Type type = obj.getClass().getGenericSuperclass();
			if (type instanceof ParameterizedType) {
				Type[] types = ((ParameterizedType) type).getActualTypeArguments();
				for(Type t : types) {
					if (t instanceof Class) {
						ret.add((Class)t);
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ret;
	}
}
