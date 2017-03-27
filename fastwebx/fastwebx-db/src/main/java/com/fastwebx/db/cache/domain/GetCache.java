package com.fastwebx.db.cache.domain;
/**
 * @author mj
 */
public abstract class GetCache<P,T> {
	protected volatile T t;
	protected volatile boolean runned;
	
	public T get(P p) {
		if(!runned){
			t = doGeted( p);
			runned = true;
		}
		return t;
	}
	
	protected abstract T doGeted(P p);
	
	public void set(T t){
		this.t = t;
		this.runned = true;
	}
}
