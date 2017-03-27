package com.fastwebx.cacheIndex.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.fastwebx.common.dao.inf.IJoinPk;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.dao.inf.cache.ICacheIndex;
import com.fastwebx.common.util.pojo.BeginEnd;
import com.fastwebx.inf.IJedisWrap;
import com.fastwebx.redis.JedisApi;
/**
 * 根据索引来进行缓存
 * @author ytrgmj
 *
 * @param <Pojo>
 */
public abstract class AbsRedisIndex<Pojo> implements ICacheIndex<Pojo>{

	
	/**
	 * 指定的key
	 */
	protected String key;
	public AbsRedisIndex(){
		this.key = doGetKey();
	}
	/**
	 * 设定key 子类可以重写
	 * @return
	 */
	protected String doGetKey(){
		return this.getClass().getSimpleName();
	}
	
	protected String getKey(){
		return key;
	}
	/**
	 * 返回一个类的主键
	 * @param pojo
	 * @return
	 */
	protected Object getValue(Pojo pojo){
		if(pojo instanceof IJoinPk){
			return ((IJoinPk) pojo).acqJoinPk();
		}
		if(pojo instanceof IPk){
			return ((IPk) pojo).acqPk();
		}
		return null;
	}
	
	abstract protected Number getScore(Pojo pojo);
	
	abstract protected int doDel(IJedisWrap wrap,Pojo pojo);
	
	abstract protected int doUpdate(IJedisWrap wrap,Pojo pojo);
	
	abstract protected int doAdd(IJedisWrap wrap,Pojo pojo);
		
	@Override
	public int del(Pojo pojo) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		try{
			
			return doDel(wrap,pojo);
		}finally{
			acqJedisApi().free(wrap);
		}
	}

	@Override
	public int update(Pojo pojo) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		try{
			
			return doUpdate(wrap,pojo);
		}finally{
			acqJedisApi().free(wrap);
		}
	}

	@Override
	public void add(Pojo pojo) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		try{
			doAdd(wrap,pojo);
		}finally{
			acqJedisApi().free(wrap);
		}
	}
	
	
	
	
	/**
	 * 把一个集合存到缓存中
	 * @param ret
	 */
	public void saveToCache(Collection<Pojo> ret){
		if(ret!=null && ret.size()>0){
			IJedisWrap wrap = acqJedisApi().getWrap();
			
				try{
					for(Pojo t:ret){
						if(t!=null)
							doAdd(wrap,t);
					}
				}finally{
					acqJedisApi().free(wrap);
				}
			
		}
	}
	
	
	
	
	protected abstract JedisApi acqJedisApi();
	
	
	
	
}
