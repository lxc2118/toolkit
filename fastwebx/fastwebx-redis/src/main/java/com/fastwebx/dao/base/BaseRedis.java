package com.fastwebx.dao.base;

import javax.annotation.Resource;


import com.fastwebx.common.dao.ISimpleCrud;
import com.fastwebx.common.dao.inf.IJoinPk;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.inf.IJedisWrap;
import com.fastwebx.redis.JedisApi;

import java.io.Serializable;
/**
 * 根据主键保存到cache中
 * @author ytrgmj
 *
 * @param <Pojo>
 */
public abstract class BaseRedis<Pojo> implements ISimpleCrud<Pojo> {

	
	
	protected abstract JedisApi acqJedisApi();
	public BaseRedis(){
		
	}
	/**
	 * 构建主键
	 * @param pk
	 * @return
	 */
	abstract protected String buildKey(Object  pk);
	
	
	@Override
	public void add(Pojo pojo) {
		
		IJedisWrap wrap = acqJedisApi().getWrap();
		try{
			wrap.set(this.buildKey((IPk)pojo), pojo);
		}finally{
			acqJedisApi().free(wrap);
		}
	}

	@Override
	public int del(Pojo pojo) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		int ret = 0;
		try{
			ret = wrap.del(this.buildKey((IPk)pojo));
		}finally{
			acqJedisApi().free(wrap);
		}
		return ret;
	}

	@Override
	public int update(Pojo pojo) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		int ret = 1;
		try{
			wrap.set(this.buildKey((IPk)pojo),pojo);
		}finally{
			acqJedisApi().free(wrap);
		}
		return ret;
	}

	@Override
	public Pojo get(Object pk) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		Pojo ret = null;
		try{
			ret =(Pojo) wrap.get(this.buildKey(pk));
		}finally{
			acqJedisApi().free(wrap);
		}
		return ret;
	}

	@Override
	public Pojo getByIPk(IPk ipk) {
		IJedisWrap wrap = acqJedisApi().getWrap();
		Pojo ret = null;
		try{
			ret =(Pojo) wrap.get(this.buildKey(ipk));
		}finally{
			acqJedisApi().free(wrap);
		}
		return ret;
	}
}
