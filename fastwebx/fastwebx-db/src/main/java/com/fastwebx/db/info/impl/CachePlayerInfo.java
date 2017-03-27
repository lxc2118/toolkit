package com.fastwebx.db.info.impl;

import com.fastwebx.db.cache.domain.DbCache;
import com.fastwebx.db.cache.domain.FWCache;
import com.fastwebx.db.cache.inf.ICache;
import com.fastwebx.db.info.IPlayerState;
import com.fastwebx.db.info.ISysInfo;
/**
 * 
 * @author ytrgmj
 *
 * @param <S> 系统属性
 */
public abstract class CachePlayerInfo<S> implements IPlayerState,ICache<S> {
	protected volatile FWCache<S> dbCache;
	
	@Override
	public FWCache<S> acqCache() {
		if(dbCache==null)
			dbCache = createDbCache();
		return dbCache;
	}
	/**
	 * 创建db缓存
	 * @return
	 */
	protected abstract FWCache<S> createDbCache();

	@Override
	public void fitSysInfo(ISysInfo info) {
		this.acqCache().set((S)info);
		
	}
	
	public S acqSysInfo(){
		return this.acqCache().get();
	}
	
}
