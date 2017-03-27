package com.fastwebx.web.json.imp;

import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.fastwebx.web.json.JArrayObj;
import com.fastwebx.web.json.JObj;
import com.fastwebx.web.json.imp.builder.JsonBuilder;

import junit.framework.TestCase;

/**
 * @author mj
 */
public class DefJsonParserTest extends TestCase {
	public void testParser(){
		JObj obj = new JObj();
		obj.setAaa("aaaerer");
		obj.setBbb(1234);
		obj.setCcc(new Date());
		DefJsonParser p = new DefJsonParser();
		JSON json = (p.parse(obj));
		System.out.println(json);
		
		JsonBuilder<JObj> builder = new JsonBuilder<JObj>(JObj.class);
		JObj obj1 = builder.build(json);
		System.out.println(obj1.getAaa());
		System.out.println(obj1.getBbb());
		System.out.println(obj1.getCcc());
	}
	
	public void test2(){
		JArrayObj obj = new JArrayObj();
		obj.setMmm("mm12345");
		obj.setObjs(new JObj[]{
				new JObj("ttt",1),
				new JObj("ttt1",2),
				new JObj("ttt2",3),
		});
		DefJsonParser p = new DefJsonParser();
		JSON json = (p.parse(obj));
		System.out.println(json);
		JsonBuilder<JArrayObj> builder = new JsonBuilder<JArrayObj>(JArrayObj.class);
		JArrayObj obj1 = builder.build(json);
		System.out.println(obj1.getMmm());
		for(JObj o:obj1.getObjs()){
			System.out.println(o.getAaa()+" "+o.getBbb());
		}
	}
}
