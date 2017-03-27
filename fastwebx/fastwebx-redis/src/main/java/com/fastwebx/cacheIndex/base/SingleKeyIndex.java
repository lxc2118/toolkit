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
 * 单键的一个缓存构造
 * @author ytrgmj
 *
 * @param <Pojo>
 */
public abstract class SingleKeyIndex<Pojo> extends AbsRedisIndex<Pojo> {
	


	@Override
	public int doDel(IJedisWrap wrap,Pojo pojo) {
		
		return wrap.zrem(this.getKey(),  getValue(pojo));
		
	}

	@Override
	public int doUpdate(IJedisWrap wrap,Pojo pojo) {
		
		return wrap.zadd(this.getKey(), this.getScore(pojo).doubleValue(), getValue(pojo));
	}

	@Override
	public int doAdd(IJedisWrap wrap, Pojo pojo) {
		
		return wrap.zadd(this.getKey(), this.getScore(pojo).doubleValue(), getValue(pojo));
	}

	
	/**
	 * 根据缓存索引找
	 * @param value
	 * @return
	 */
	public Collection findByIndex(double min,double max) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		Collection set = null;
		try{
			set = wrap.zrangeByScore(this.getKey(), min, max);
		}finally{
			acqJedisApi().free(wrap);
		}
		return set;
	}
	/**
	 * 根据缓存索引找
	 * @param value
	 * @return
	 */
	public Collection findByIndex(double value) {
		return findByIndex(value,value);
	}
	/**
	 * 根据索引值删除
	 * @param obj
	 */
	public void delByPk(Object obj){
		IJedisWrap wrap = this.acqJedisApi().getWrap();
		try{
			wrap.zrem(this.getKey(), obj);
		}finally{
			this.acqJedisApi().free(wrap);
		}
	}
	
	/**
	 * 根据某个范围删除
	 * @param begin
	 * @param end
	 */
	public void zremrangeByScore(Number begin,Number end){
		IJedisWrap wrap = acqJedisApi().getWrap();
		
		try{
			wrap.zremrangeByScore(this.getKey(), begin.doubleValue(), end.doubleValue());
		}finally{
			acqJedisApi().free(wrap);
		}
	}
	/**
	 * 在缓存中找到所有
	 * @return
	 */
	public Collection findAll(){
		IJedisWrap wrap = acqJedisApi().getWrap();
		
		try{
			return wrap.zrange(getKey(), 0, -1);
		}finally{
			acqJedisApi().free(wrap);
		}
	}
	/**
	 * 找到范围值
	 * @param begin
	 * @param end
	 * @return
	 */
	public Collection zrange(long begin,long end){
		IJedisWrap wrap = acqJedisApi().getWrap();
		
		try{
			return wrap.zrange(getKey(), begin, end);
		}finally{
			acqJedisApi().free(wrap);
		}
	}

	/**
	 * 判断对应的值是否存在
	 * @param pk
	 * @return
	 */
	public boolean exist(Object pk){
		IJedisWrap wrap = acqJedisApi().getWrap();
		
		try{
			return wrap.zscore(getKey(), pk)!=null;
		}finally{
			acqJedisApi().free(wrap);
		}
	}
	
	
	
}
