package com.fastwebx.common.execute.server;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class LinkExecuteTest extends TestCase {
	public void testCal(){
		Integer ret = new TExe(1)
			.addNext(new TExe(2))
			.addNext(new TExe(3) )
			.execute(4);
		System.out.println("ret="+ret);
	}
	
	
}
