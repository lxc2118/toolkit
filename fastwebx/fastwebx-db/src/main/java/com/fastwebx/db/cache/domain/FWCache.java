package com.fastwebx.db.cache.domain;


/**
 * 半线程安全
 * @author mj
 */
public abstract class FWCache<T> {
	protected volatile T t;
	protected volatile boolean runned;
	
	public T get() {
		if(!runned){
			t = doGeted();
			runned = true;
		}
		return t;
	}
	
	protected abstract T doGeted();
	
	public void set(T t){
		this.t = t;
		this.runned = true;
	}
}
