package com.fastwebx.db.util;

import java.util.Map;

import com.fastwebx.common.reflect.method.util.MethodUtil;
import com.fastwebx.db.dao.BaseDao;

public class JoinTableUtil {
	static public Object get(Object obj,String mainCol,BaseDao dao,String col){
		if(obj==null) return null;
		Object pk = MethodUtil.get(obj, mainCol);
		Object pojo = dao.get(pk);
		if(pojo==null) return null;
		return MethodUtil.get(pojo, col);
	}
	
	static public void wearCloth(Map map,Object pojo,String mainCol,BaseDao dao,String col){
		Object value = get(pojo,mainCol,dao,col);
		if(value!=null)
			map.put(col, value);
	}
	
	static public void wearCloth(Map map,Object pojo,BaseDao dao){
		String mainCol = dao.getClassNameWithSuffix("Id");
		String col = dao.getClassNameWithSuffix("Name");

		wearCloth( map, pojo, mainCol, dao, col);
	}
}
