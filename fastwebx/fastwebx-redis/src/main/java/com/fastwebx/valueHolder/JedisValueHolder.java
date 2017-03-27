package com.fastwebx.valueHolder;


import com.fastwebx.common.context.S;
import com.fastwebx.common.util.SerializeUtil;
import com.fastwebx.common.valueHolder.IValueHolder;
import com.fastwebx.inf.IJedisWrap;
import com.fastwebx.redis.JedisApi;
import com.fastwebx.redis.JedisRunner;
import com.fastwebx.redis.JedisWrap;
/**
 * sessioncontext用于将session值保存到缓存里面
 * @author mj
 *
 */
public class JedisValueHolder implements IValueHolder{

	private String id="";
	
	public JedisValueHolder(String id){
		if(id==null) id="";
		this.id = id;
	}
	
	
	
	@Override
	public Object get(final String field) {
		
		Object ret = null;
		JedisApi api = S.get(JedisApi.class);
		IJedisWrap jedis = api.getWrap();
		try{
			ret = jedis.hget(id, field);
		}finally{
			api.free(jedis);
		}
		return ret;
	}

	@Override
	public Object set(String field, Object t) {
		JedisApi api = S.get(JedisApi.class);
		IJedisWrap jedis = api.getWrap();
		try{
			jedis.hset(id, field,t);
		}finally{
			api.free(jedis);
		}
		return t;
	}

	@Override
	public void remove(String fields) {
		
		JedisApi api = S.get(JedisApi.class);
		IJedisWrap jedis = api.getWrap();
		try{
			jedis.hdel(id, fields);
		}finally{
			api.free(jedis);
		}
		
	}



	@Override
	public boolean containsKey(String key) {
		JedisApi api = S.get(JedisApi.class);
		IJedisWrap jedis = api.getWrap();
		try{
			Boolean b= jedis.hexists(id,key);
			if(b==null) b= false;
			return b;
		}finally{
			api.free(jedis);
		}
	}

	

}
