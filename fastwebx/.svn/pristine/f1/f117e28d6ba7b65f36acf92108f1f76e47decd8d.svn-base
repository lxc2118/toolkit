package com.fastwebx.web.json;

import java.util.Collection;
import java.util.HashMap;

import com.alibaba.fastjson.JSON;
import com.fastwebx.web.inf.IToJSON;
import com.fastwebx.web.util.JsonUtil;

/**
 * jsonParser 的反面，把json 构建成java类
 * @author mj
 */
public class JsonBuilderContext { 
	static private JsonBuilderContext ins = new JsonBuilderContext();
	static public JsonBuilderContext get(){
		return ins;
	}
	private HashMap<String, IJsonBuilder> map = new HashMap<String, IJsonBuilder>();
	
	public void add(IJsonBuilder builder ){
		if(builder!=null)
			map.put(builder.getKey(), builder);
	}
	
	public void setList(Collection<IJsonBuilder> list){
		
		if(list!=null){
			for(IJsonBuilder builder:list){
				add(builder);
			}
		}
	}
	/**
	 * 进行初始化
	 * @param clazz
	 * @param json
	 * @return
	 */
	public <T> T buildClass(Class<T> clazz,JSON json){
		if(clazz==null) return null;
		String key = clazz.getSimpleName();
		return (T)build(key,json);
	}
	 
	public Object build(String key,JSON json){
		if(key==null || json==null) return null;
		IJsonBuilder builder = map.get(key);
		if(builder==null) return null;
		return builder.build(json);
	}
	
	private JsonBuilderContext(){
		
	}
	
	
}
