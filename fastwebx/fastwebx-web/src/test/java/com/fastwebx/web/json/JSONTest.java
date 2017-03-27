package com.fastwebx.web.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class JSONTest extends TestCase {
	public void testParse(){
		String s = "{'dd':123,'xx':[1,2,3],'yy':[{'a':123,'b':'ttt'},{'a':456,'b':'1ttt'}]}";
		JSONObject obj = JSON.parseObject(s);
		System.out.println(obj.getString("dd"));
		JSONArray array = obj.getJSONArray("xx");
		for(int i=0;i<array.size();i++){
			System.out.println(array.getIntValue(i));
		}
		
		JSONArray array1 = obj.getJSONArray("yy");
		for(int i=0;i<array1.size();i++){
			JSONObject o =array1.getJSONObject(i);
			System.out.println(o.toString());
			System.out.println(o.getIntValue("a"));
		}
	}
}
