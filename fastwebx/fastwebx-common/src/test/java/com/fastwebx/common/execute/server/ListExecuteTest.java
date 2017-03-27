package com.fastwebx.common.execute.server;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class ListExecuteTest extends TestCase {
	public void testCal2(){
		ListExecutor<Integer> le = new ListExecutor<Integer>();
		Integer ret = le.add(new TExe(1))
			.add(new TExe(2))
			.add(new TExe(3))
			.execute(4);
		System.out.println(ret);
	}
}
