package com.fastwebx.db.cache.domain;

import java.util.function.Supplier;

import com.fastwebx.db.dao.BaseDao;

/**
 * 从数据库中查找放到缓存中
 * @author mj
 */
public class DbCache<T> extends FWCache<T> {
	protected BaseDao dao;
	protected Supplier supplier;
	public DbCache(BaseDao dao,Supplier supplier){
		this.dao = dao;
		this.supplier = supplier;
	}
	
	@Override
	protected T doGeted() {
		return (T)this.dao.get(this.supplier.get());
	}

}
