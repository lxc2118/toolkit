package com.fastwebx.redis;



import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import com.fastwebx.inf.IJedisWrap;

public class JedisApi {
	private String host;
	private int port;
	private int timeout;
	private Object locker = new Object();
	private JedisPoolConfig jedisPoolConfig;
	
	private volatile JedisPool pool;
	
	
	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public JedisPoolConfig getJedisPoolConfig() {
		return jedisPoolConfig;
	}

	public void setJedisPoolConfig(JedisPoolConfig jedisPoolConfig) {
		this.jedisPoolConfig = jedisPoolConfig;
	}
	
	protected Jedis get(){
		synchronized(locker){
			if(this.pool==null){
				jedisPoolConfig.setTestOnBorrow(true);
				this.pool=new JedisPool(jedisPoolConfig,host,port,timeout); 
			}
		}
		return this.pool.getResource();
	}
	
	public IJedisWrap getWrap(){
		return new JedisWrap(get());
	}
	
	public void flushall(){
		this.get().flushAll();
	}
	
	
	public void free(IJedisWrap jedis){
		this.pool.returnResource(jedis.getJedis());
	}
	
}
