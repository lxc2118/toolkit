package com.fastwebx.common.util.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 放list的一些常用操作
 * @author mj
 *
 */
public class ListUtil {
	/**
	 * 将数组构建成一个list
	 * @param objects
	 * @return
	 */
	public static List wrap(Object ... objects){
		List ret = new ArrayList();
		if(objects==null) return null;
		for(Object object:objects){
			if(object!=null)
				ret.add(object);
		}
		return ret;
	}
	
	public static boolean isEmpty(Collection list){
		if(list==null) return true;
		return list.size()==0;
	}
	
}
