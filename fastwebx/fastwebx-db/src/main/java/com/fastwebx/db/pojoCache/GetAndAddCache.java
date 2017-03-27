package com.fastwebx.db.pojoCache;

import com.fastwebx.common.dao.ICrud;
import com.fastwebx.common.pojoCache.AbsPojoCache;
import com.fastwebx.db.dao.BaseDao;

/**
 * 取不到则增加的 cache
 * @author mj
 *
 * @param <Pojo>
 */
public abstract class GetAndAddCache<Pojo> extends AbsPojoCache<Pojo> {

	@Override
	protected Pojo doGet(Object pk) {
	
		return acqDao().getOrAdd((Pojo)pk);
	}
	
	protected abstract BaseDao<Pojo> acqDao();

	

	
	
}