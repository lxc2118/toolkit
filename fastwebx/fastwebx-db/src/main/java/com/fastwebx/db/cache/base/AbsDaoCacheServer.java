package com.fastwebx.db.cache.base;

import com.fastwebx.db.dao.BaseDao;

/**
 * 让dao从数据库里查找
 * @author mj
 */
public abstract class AbsDaoCacheServer<T, Pojo> extends AbsMapCacheServer<T, Pojo> {

	protected abstract BaseDao<Pojo> acqDao();
	
	@Override
	protected Pojo create(T t) {
		Pojo pojo = this.doCreate(t);
		return this.acqDao().getOrAdd(pojo);
	}
	
	abstract protected Pojo doCreate(T t);
	
}
