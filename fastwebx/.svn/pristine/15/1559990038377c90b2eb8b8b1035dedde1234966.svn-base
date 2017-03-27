package com.fastwebx.db.cache.inf;

import com.fastwebx.db.cache.domain.FWCache;

/**
 * @author mj
 */
public interface ICache<T> {
	FWCache<T> acqCache();
	default T cacheGet(){
		return acqCache().get();
	}
	
	default void cacheSet(T t){
		acqCache().set(t);
	}
}
