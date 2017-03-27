package com.fastwebx.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import com.fastwebx.common.dao.ISimpleCrud;
import com.fastwebx.common.dao.inf.IJoinPk;
import com.fastwebx.common.dao.inf.IModifier;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.dao.inf.cache.IClearCache;
import com.fastwebx.common.dao.inf.cache.IClearPojo;
import com.fastwebx.common.dao.inf.cache.IRefreshCache;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.dao.base.BaseRedis;
import com.fastwebx.db.dao.BaseDao;
import com.fastwebx.inf.IJedisWrap;
import com.fastwebx.redis.JedisApi;

public abstract class RedisCacheDao<Pojo extends IPk> extends BaseDao<Pojo> 
	implements IRefreshCache {
	
	
	@Resource
	protected JedisApi jedisApi;
	private ISimpleCrud<Pojo> cacheDao;
	
	public RedisCacheDao() {
		super();
		initCache();
	}

	public void refresh(Object pk) {
	}

	@Override
	protected ISimpleCrud<Pojo> getCacheDao() {
		return cacheDao;
	}

	protected void initCache() {
		this.cacheDao = new MyCache();
		this.listeners = buildListener();
	}

	protected List buildListener() {
		List ret = new ArrayList();
		ret.add(cacheDao);
		return ret;
	}

	@Override
	public void refreshCache() {
		for(Pojo p:findAll()){
			cacheDao.update(p);
		}
		
	}
	
	class MyCache extends BaseRedis<Pojo> implements IClearPojo<Pojo> {

		@Override
		protected JedisApi acqJedisApi() {
			return jedisApi;
		}

		@Override
		protected String buildKey(Object pk) {
			if (pk == null)
				return null;
			if (pk instanceof IJoinPk)
				pk = ((IJoinPk) pk).acqJoinPk();
			if (pk instanceof IPk)
				pk = ((IPk) pk).acqPk();
			StringBuilder sb = new StringBuilder();
			sb.append(classT.getSimpleName()).append("_").append(pk);

			return sb.toString();
		}

		@Override
		public void removeFormCache(Pojo pojo) {
			this.del(pojo);
		}

	}
	
}
