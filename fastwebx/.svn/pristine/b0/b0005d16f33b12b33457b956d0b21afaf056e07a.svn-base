package com.fastwebx.db.cache.base;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 具有缓存的服务类
 * @author mj
 */
public abstract class AbsMapCacheServer<T ,Pojo> {
	protected ConcurrentHashMap<T, Pojo> cacheMap = new  ConcurrentHashMap<>();
	public Pojo get(T t){
		return cacheMap.computeIfAbsent(t, this::create);
	}
	protected abstract Pojo create(T t);
}
