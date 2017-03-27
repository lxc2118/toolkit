package test;

import redis.clients.jedis.Jedis;
import junit.framework.TestCase;

public class TestJedis extends TestCase {
	public void testSet(){
		Jedis jedis = new Jedis("192.168.2.250");
		jedis.set("aaa", "1111");
		jedis.close();
	}
	
	public void testGet(){
		Jedis jedis = new Jedis("192.168.2.250");
		System.out.println(jedis.get("aaa"));
		
		jedis.close();
	}
}
