package com.fastwebx.web.util;

import junit.framework.TestCase;

public class JsonUtilTest extends TestCase {
	public void testParse(){
		System.out.println(JsonUtil.parse(new TestObj()).toString());
	}
}
