package com.fastwebx.web.util;

import junit.framework.TestCase;

public class JsonHelpObjTest extends TestCase {
	public void testJSON(){
		JsonHelpObj jho = new JsonHelpObj();
		jho.build("event")
			.build("update")
			.build("playerWakeRecord")
			.put("test", 123)
			.put("abc", "ddd");
		System.out.println(jho.get());
	}
	
	public void testJSONArray(){
		JsonHelpObj jho = new JsonHelpObj();
		jho.build("event")
			.build("update")
			.build("playerWakeRecord")
			.buildArray("update")
			.add("abc");
		System.out.println(jho.get());
	}
}
