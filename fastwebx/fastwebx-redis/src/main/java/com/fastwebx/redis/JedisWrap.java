package com.fastwebx.redis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import redis.clients.jedis.Jedis;

import com.fastwebx.common.util.SerializeUtil;
import com.fastwebx.inf.IJedisWrap;

public class JedisWrap implements IJedisWrap{
	private Jedis jedis;
	public JedisWrap(Jedis jedis){
		
		this.jedis = jedis;
	}
	
	public Jedis getJedis() {
		return jedis;
	}
	
	public void flushall(){
		jedis.flushAll();
	}
	
	

	@Override
	public Double zscore(String key, Object value) {
		
		return this.jedis.zscore(key.getBytes(), 
				SerializeUtil.serialize(value));
	}

	public void set(String key,Object obj){
		
		this.jedis.set(key.getBytes(), 
				SerializeUtil.serialize(obj));
		
	}
	
	public Object get(String key){
		if(key==null) return null;
		return SerializeUtil.unserialize(this.jedis.get(key.getBytes()));
	}
	
	public Integer getInteger(String key){
		return (Integer)get(key);
	}
	public Double getDouble(String key){
		return (Double)get(key);
	}
	public Date getDate(String key){
		return (Date)get(key);
	}
	public String getString(String key){
		return (String)get(key);
	}

	@Override
	public Object hget(String id, String fields) {
		
		return SerializeUtil.unserialize(jedis.hget(id.getBytes(),fields.getBytes()));
	}

	@Override
	public int hset(String id, String fields, Object t) {
		Long ret = jedis.hset(id.getBytes(), fields.getBytes(), SerializeUtil.serialize(t));
		if(ret==null) return 0;
		return ret.intValue();
	}

	@Override
	public int hdel(String id, String fields) {
		
		Long ret = jedis.hdel(id.getBytes(), fields.getBytes());
		
		if(ret!=null) return ret.intValue();
		return 0;
	}
	
	@Override
	public Boolean hexists(String id, String fields) {
		
		return jedis.hexists(id.getBytes(), fields.getBytes());
		
	
	}

	@Override
	public int zadd(String key, double num, Object value) {
		Long ret = jedis.zadd(key.getBytes(), num, SerializeUtil.serialize(value));
		if(ret!=null) return ret.intValue();
		return 0;
		
	}
	
	public boolean exists(String key){
		return jedis.exists(key.getBytes());
	}

	@Override
	public Collection zrange(String key, long begin, long length) {
		Set<byte[]> set = jedis.zrange(key.getBytes(),begin,length);
		List ret = new ArrayList();
		for(byte[] bytes:set){
			if(bytes!=null){
				Object obj = SerializeUtil.unserialize(bytes);
				if(obj!=null)
					ret.add(obj);
			}
		}
		return ret;
	}

	@Override
	public Collection zrangeByScore(String key, double min, double max) {
		
		Set<byte[]> set = jedis.zrangeByScore(key.getBytes(), min, max);
		List ret = new ArrayList();
		for(byte[] bytes:set){
			if(bytes!=null){
				Object obj = SerializeUtil.unserialize(bytes);
				if(obj!=null)
					ret.add(obj);
			}
		}
		return ret;
	}

	@Override
	public int zcard(String key) {
		
		Long ret = jedis.zcard(key.getBytes());
		if(ret!=null) return ret.intValue();
		return 0;
	}

	@Override
	public int del(String key) {
		
		Long ret = jedis.del(key.getBytes());
		if(ret!=null) return ret.intValue();
		return 0;
	}
	
	public int zrem(String key,Object value){
		Long ret = jedis.zrem(key.getBytes(), SerializeUtil.serialize(value));
		if(ret!=null) return ret.intValue();
		return 0;
				
	}
	
	
	
	public int zremrangeByScore(final String key, final double start,
		    final double end){
		Long ret = jedis.zremrangeByScore(key.getBytes(),start,end);
		if(ret==null) return 0;
		return ret.intValue();
	}
	
	public Collection zrangeByScore(String key, final double min,
		    final double max, final int offset, final int count){
		Set<byte[]> set = jedis.zrangeByScore(key.getBytes(), min, max,offset,count);
		List ret = new ArrayList();
		for(byte[] bytes:set){
			if(bytes!=null){
				Object obj = SerializeUtil.unserialize(bytes);
				if(obj!=null)
					ret.add(obj);
			}
		}
		return ret;
	}
	
	public List hgetAllValue(final String key){
		List ret = new ArrayList();
		Map<byte[], byte[]> map = jedis.hgetAll(key.getBytes());
		for(byte[] bytes:map.values()){
			if(bytes!=null){
				Object obj = SerializeUtil.unserialize(bytes);
				if(obj!=null)
					ret.add(obj);
			}
		}
		return ret;
	}
	
	
	
	
	
	
}
