package com.fastwebx.common.execute.server;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class ListParamChgExtTest extends TestCase {
	public void testCal(){
		ListParamChgExt<String,Integer> list = new  ListParamChgExt<String,Integer>(4)
				.add(new TExe(1))
				.add(new TExe(2))
				.add(new TExe(3));
		list.execute(null);
		System.out.println(list.getResult());
	}
}
