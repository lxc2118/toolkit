package com.fastwebx.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import com.fastwebx.common.dao.ISimpleCrud;
import com.fastwebx.common.dao.inf.cache.IRefreshCache;
import com.fastwebx.dao.base.MultiKeyRedis;
import com.fastwebx.db.dao.BaseDao;
import com.fastwebx.redis.JedisApi;

/**
 * 根据某一个字段会进行缓存<br>
 * 例如学生和老师关系中，将学生表根据老师id进行缓存<br>
 * 增删改学生数据后会自动维护缓存
 * @author mj
 *
 */
public abstract class RedisIndexDao<Pojo> extends BaseDao<Pojo> 
	implements IRefreshCache{
	
	
	
	

	@Resource
	protected JedisApi jedisApi;
	protected MyCache myCache;
	protected boolean needGetFromCache = false;
	
	
	
	
	@Override
	public void refreshCache() {
		for(Pojo p:findAll()){
			myCache.update(p);
		}
		
	}
	@Override
	protected ISimpleCrud<Pojo> getCacheDao() {
		if(!needGetFromCache) return null;
		return myCache;
	}
	/**
	 * 返回索引字段的值
	 * @param pojo
	 * @return
	 */
	
	abstract protected Object getPojoIndex(Pojo pojo);
	/**
	 * 从数据库中查询
	 * @param obj
	 * @return
	 */
	abstract protected Collection<Pojo> findFromDb(Object obj);
	
	public RedisIndexDao(){
		super();
		this.listeners = buildListener();
	}
	/**
	 * 构建增删改的监听器
	 * @return
	 */
	protected List buildListener(){
		List ret = new ArrayList();
		myCache = new MyCache();
		ret.add(myCache);
		return ret;
	}
	
	/**
	 * 根据索引字段查询
	 * @param obj
	 * @return
	 */
	public Collection<Pojo> findByIndex(Object obj){
		Collection<Pojo> ret = myCache.findFromCache(obj);
		if(ret==null || ret.size()==0){
			ret = findFromDb(obj);
			if(ret!=null && ret.size()>0){
				for(Pojo pojo:ret){
					myCache.saveToCache(pojo);
				}
			}
		}
		return ret;
	}
	/**
	 * 缓存中的键值
	 * @return
	 */
	protected String buildCacheKey(){
		return this.getClass().getSimpleName();
	}
	
	/**
	 * 对应的缓存类
	 * @author ytrgmj
	 *
	 */
	class MyCache extends MultiKeyRedis<Pojo>{
		/**
		 * 重写取键值方法，用dao的类名取键值
		 */
		protected String doGetKey(){
			return buildCacheKey();
		}

		
		@Override
		protected Object getIndex(Pojo pojo) {
			
			return getPojoIndex(pojo);
		}

		@Override
		protected JedisApi acqJedisApi() {
		
			return jedisApi;
		}
		
	}
}
