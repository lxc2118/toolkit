package com.fastwebx.web.json.imp.builder;

import com.alibaba.fastjson.JSON;
import com.fastwebx.web.json.IJsonBuilder;

/**
 * @author mj
 */
public class JsonBuilder<T> implements IJsonBuilder<T>{
	private Class<T> clazz;
	
	public JsonBuilder(Class clazz){
		this.clazz = clazz;
	}
	public Class<T> getClazz() {
		return clazz;
	}

	public void setClazz(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public T build(JSON json) {
		return (T)JSON.toJavaObject(json,clazz);
	}

	@Override
	public String getKey() {
		return null;
	}

}
