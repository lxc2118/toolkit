package com.fastwebx.db.version.processor;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author mj
 */
public class VProcessor {
	static final public int finish = 1; 
	
	public static int checkAndDo(Supplier<Boolean> checker,Supplier<Integer> supplier,Runnable reload){
		return process(new Supplier<Integer>(){

			@Override
			public Integer get() {
				if(!checker.get()){
					return finish;
				}
				return supplier.get();
			}
			
		},reload);
	}
	
	public static int process(Supplier<Integer> supplier,Runnable reload){
		return process(supplier,reload,10l);
	}
	public static int process(Supplier<Integer> supplier,Runnable reload,long time){
		if(supplier==null) return 0;
		if(reload==null) {
			return supplier.get();
			
		}
		int ret =0 ;
		while(ret==0){
			ret = supplier.get();
			if(ret==0){
				sleep(time);
				reload.run();
			}
		}
		return ret;
	}
	
	protected static void sleep(long s) {
		if(s==0) return;
		try {
			Thread.sleep(s);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
