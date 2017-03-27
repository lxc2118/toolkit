package com.fastwebx.common.execute.server;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class ChgExecutorTest extends TestCase {
	public void testCal(){
		ChgExecutor<String,Integer> executor = new ChgExecutor<String,Integer>(
				new TExe(1),
				2);
		executor.addNext(new TSExe());
		String ret =executor.execute("aaaa");
		System.out.println(ret);
		System.out.println(executor.getResult());
	}
}
