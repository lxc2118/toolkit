package com.fastwebx.dao;

import java.io.Serializable;

import javax.annotation.Resource;

import com.fastwebx.common.dao.ISimpleCrud;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.dao.base.BaseRedis;
import com.fastwebx.inf.IJedisWrap;
import com.fastwebx.redis.JedisApi;


public abstract class RedisDao<Pojo extends Serializable> extends BaseRedis<Pojo>{
	protected Class clazz;
	@Resource
	private JedisApi jedisApi;
	protected boolean needGetClass = true;	
	public RedisDao(){
		this.initClass();
	}

	@Override
	protected JedisApi acqJedisApi() {
		return jedisApi;
	}
	@Override
	protected String buildKey(Object  pk){
		if(pk==null) return null;
		StringBuilder sb = new StringBuilder();
		sb.append(clazz.getSimpleName())
			.append("_")
			.append(pk);
		return sb.toString();
	}
	 
	protected void initClass(){
		if(needGetClass)
			this.clazz = SuperClassHunter.get().acqClass(this);
	}
}
