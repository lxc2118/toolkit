package com.fastwebx.cacheIndex.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import com.fastwebx.common.dao.inf.IJoinPk;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.dao.inf.cache.ICacheIndex;
import com.fastwebx.common.util.StrUtil;
import com.fastwebx.common.util.pojo.BeginEnd;
import com.fastwebx.inf.IJedisWrap;
import com.fastwebx.redis.JedisApi;
/**
 * 多键值的缓存类
 * @author ytrgmj
 *
 * @param <Pojo>
 */
public abstract class MutiKeyIndex<Pojo> extends AbsRedisIndex<Pojo>{
	
	
	
	/**
	 * 
	 * 根据索引值和指定的key构建联合主键
	 * @param pojo
	 * @return
	 */
	protected String buildJoinKey(Pojo pojo){
		return StrUtil.link(this.getKey(),getScore(pojo));
	}

	

	@Override
	protected int doDel(IJedisWrap wrap, Pojo pojo) {
	
		return wrap.hdel(buildJoinKey(pojo), getValue(pojo).toString());
	}

	@Override
	protected int doUpdate(IJedisWrap wrap, Pojo pojo) {
		return wrap.hset(buildJoinKey(pojo), getValue(pojo).toString(), getValue(pojo));
	}

	@Override
	protected int doAdd(IJedisWrap wrap, Pojo pojo) {
		return wrap.hset(buildJoinKey(pojo), getValue(pojo).toString(), getValue(pojo));
	}

	

	/**
	 * 根据索引从缓存中查询值
	 * @param index
	 * @return
	 */
	protected Collection findFromCache(double index) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		try{
			Collection<Pojo> ret = wrap.hgetAllValue(StrUtil.link(this.getKey(),index));
			return ret;
		}finally{
			acqJedisApi().free(wrap);
		}
	}

	
	

	
	
	
}
