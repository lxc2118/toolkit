package com.fastwebx.redis;

import com.fastwebx.common.context.S;
import com.fastwebx.inf.IJedisWrap;

import redis.clients.jedis.Jedis;

public abstract class JedisRunner implements Runnable{
	protected IJedisWrap jedis;
	public void start() {
		JedisApi api = S.get(JedisApi.class);
		jedis = api.getWrap();
		try{
			run();
		}finally{
			api.free(jedis);
		}
	}

	

}
