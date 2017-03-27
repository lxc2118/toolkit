package com.fastwebx.db.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fastwebx.common.context.S;
import com.fastwebx.common.dao.inf.IGeter;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.common.util.NameUtil;

import junit.framework.TestCase;

public class TestBase<Pojo> extends TestCase {
	private static volatile boolean runned;
	
	public TestBase(){
		
		if(!runned){
			runned = true;
			try{
				new ClassPathXmlApplicationContext("applicationContext.xml");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	
	public Pojo getServer(){
		Class clazz = SuperClassHunter.get().acqClass(this);
		if(clazz!=null){
			return (Pojo)S.get(clazz);
		}
		return null;
	}
	public Pojo getById(Object pk){
		Class clazz = SuperClassHunter.get().acqClass(this);
		if(clazz!=null){
			String name = NameUtil.buildName(clazz, "Dao");
			IGeter<Pojo> geter = (IGeter)S.get(name);
			return geter.get(pk);
		}
		return null;
	}

	protected void onTime( Runnable runnable){
		long t = System.currentTimeMillis();
		if(runnable!=null){
			runnable.run();
		}
		System.out.println("time="+(System.currentTimeMillis()-t));
	}
}
