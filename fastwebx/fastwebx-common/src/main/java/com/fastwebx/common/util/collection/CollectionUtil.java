package com.fastwebx.common.util.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.fastwebx.common.ifilter.IFilter;

/**
 * 集合类的util类
 * @author mj
 *
 */
public class CollectionUtil {
	public static Collection filter(Collection c,IFilter filter){
		List ret = new ArrayList();
		if(c==null) return null;
		if(filter==null) return c;
		for(Object obj:c){
			if(filter.filter(obj)){
				ret.add(obj);
			}
		}
		return ret;
	}
}
