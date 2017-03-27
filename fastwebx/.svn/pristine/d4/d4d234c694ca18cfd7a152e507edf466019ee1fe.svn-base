package com.fastwebx.db.version.processor;

import com.fastwebx.db.version.exp.VersionExp;

/**
 * 会处理versionExp
 * @author mj
 */
public class VRunner {
	/**
	 * 运行一段代码，如果发生版本错误则重载
	 * @param runnable
	 * @param time
	 */
	public static void run(Runnable runnable){
		run(runnable,10l);
	}
	/**
	 * 运行一段代码，如果发生版本错误则重载
	 * @param runnable
	 * @param time
	 */
	public static void run(Runnable runnable,long time){
		if(runnable == null){
			return;
		}
		boolean finish = false;
		while(!finish){
			try{
				runnable.run();
				finish = true;
			}catch(VersionExp ve){
				if(time>0){
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				ve.reload();
			}
		}
	}
}
