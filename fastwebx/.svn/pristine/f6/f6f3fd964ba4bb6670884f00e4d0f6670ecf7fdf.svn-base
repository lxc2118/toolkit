package com.fastwebx.db.dao.util;

import com.fastwebx.common.context.$;
import com.fastwebx.common.dao.ICrud;
import com.fastwebx.common.util.NameUtil;

public class DaoUtil {
	public static <T> ICrud<T> buildDao(Class<T> clazz){
		return (ICrud<T>)$.get(NameUtil.buildName(clazz,"Dao"));
	}
}
