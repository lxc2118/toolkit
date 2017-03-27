package com.fastwebx.inf;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

import com.fastwebx.common.util.SerializeUtil;

public interface IJedisWrap  {
	public Jedis getJedis();
	
	public void set(String key,Object obj);
	
	public Object get(String key);
	
	public Integer getInteger(String key);
	
	public Double getDouble(String key);

	public Date getDate(String key);
	
	public String getString(String key);
	
	
	public Object hget(String id,String field);
	
	public int hset(String id, String bytes,Object t);
	
	public int hdel(String id, String fields);
	
	public Boolean hexists(String id, String fields);
	
	public int zadd(String key, double num,Object value);
	
	public Collection zrange(String key,long begin,long length);
	
	
	public Collection zrangeByScore(String key, double min,double max);
	
	public Collection zrangeByScore(String key, final double min,final double max, final int offset, final int count);
	
	public int zcard(String key);
	
	public int zrem(String key,Object value);
	
	public Double zscore(String key,Object value);
	
	public int del(String key);
	
	public List hgetAllValue(final String key);
	
	public boolean exists(String key);
	
	public int zremrangeByScore(final String key, final double start,
		    final double end);
}
