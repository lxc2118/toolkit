package com.fastwebx.dao.base;

import java.util.Collection;

import com.fastwebx.cacheIndex.base.AbsRedisIndex;
import com.fastwebx.common.dao.ISimpleCrud;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.util.StrUtil;
import com.fastwebx.inf.IJedisWrap;
import com.fastwebx.redis.JedisApi;

/**
 * 一对多的索引
 * 
 * @author mj
 *
 * @param <Pojo>
 */
public  abstract class  MultiKeyRedis<Pojo> extends AbsRedisIndex<Pojo> implements ISimpleCrud<Pojo>{

	
	/**
	 * 根据对象构建联合主键
	 * @param pojo
	 * @return
	 */
	protected String buildJoinKey(Pojo pojo){
		return buildKey(getIndex(pojo));
	}
	
	/**
	 * 根据索引值创建联合主键
	 * @param index
	 * @return
	 */
	protected String buildKey(Object index){
		return StrUtil.link(this.getKey(),index);
	}

	protected int doDel(IJedisWrap wrap, Pojo pojo) {
	
		return wrap.hdel(buildJoinKey(pojo), getValue(pojo).toString());
	}

	/**
	 * 将一个对象保存到索引中
	 * @param pojo
	 */
	public void saveToCache( Pojo pojo) {
		JedisApi jedisApi = this.acqJedisApi();
		IJedisWrap wrap = jedisApi.getWrap();
		
		try{
			wrap.hset(buildJoinKey(pojo), getValue(pojo).toString(), pojo);
		}finally{
			jedisApi.free(wrap);
		}
	}
	
	protected int doUpdate(IJedisWrap wrap, Pojo pojo) {
		int ret = 0;
		if(wrap.exists(buildJoinKey(pojo)))
			ret = wrap.hset(buildJoinKey(pojo), getValue(pojo).toString(), pojo);
		
		return ret;
	}

	
	protected int doAdd(IJedisWrap wrap, Pojo pojo) {
		int ret = 0;
		if(wrap.exists(buildJoinKey(pojo)))
			wrap.hset(buildJoinKey(pojo), getValue(pojo).toString(), pojo);
		return ret;
	}
	/**
	 * 重写了dao的get方法，使得这个方法只能通过一个值来执行
	 */
	@Override
	public Pojo get(Object obj) {
		if(obj instanceof IPk){
			JedisApi wrap = this.acqJedisApi();
			IJedisWrap jw = wrap.getWrap();
			Pojo pojo = (Pojo)obj;
			try{
				return (Pojo)jw.hget(buildJoinKey(pojo),getValue(pojo).toString());
			}finally{
				wrap.free(jw);
			}
		}
		return null;
	}

	@Override
	public Pojo getByIPk(IPk ipk) {
		
		return get(ipk);
	}
	/**
	 * 从缓存中查找
	 * @param index
	 * @return
	 */
	public Collection<Pojo> findFromCache(Object index){
		JedisApi wrap = this.acqJedisApi();
		IJedisWrap jw = wrap.getWrap();
		try{
		
			return jw.hgetAllValue(buildKey(index));
		}finally{
			wrap.free(jw);
		}
	}

	@Deprecated
	@Override
	protected Number getScore(Pojo pojo) {
		
		return null;
	}
	
	abstract protected Object getIndex(Pojo pojo);
	

	
	
	
}
