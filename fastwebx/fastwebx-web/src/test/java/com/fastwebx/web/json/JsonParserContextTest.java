package com.fastwebx.web.json;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.db.test.TestBase;

public class JsonParserContextTest extends TestCase {
	public  void testArray(){
		JSONArray array = new JSONArray();
		System.out.println(array.toJSONString());
		JSONObject obj = new JSONObject();
		obj.put("aaa",array);
		System.out.println(obj);
		
	}
}
