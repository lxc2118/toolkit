package test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import junit.framework.TestCase;

public class TestJedisPool extends TestCase {
	public void testSet(){
		JedisPool pool = new JedisPool("192.168.2.250");
		Jedis jedis = pool.getResource();
		jedis.set("bbb", "234");
		pool.returnResource(jedis);
	}
	
	public void testGet(){
		JedisPool pool = new JedisPool("192.168.2.250");
		Jedis jedis = pool.getResource();
		System.out.println(jedis.get("bbb"));
		pool.returnResource(jedis);
		
	}
}
