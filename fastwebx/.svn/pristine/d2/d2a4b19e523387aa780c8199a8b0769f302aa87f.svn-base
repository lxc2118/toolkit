package com.fastwebx.web.json.imp;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.web.json.IJsonParser;
/**
 * 将普通类转成json类
 * @author ytrgmj
 *
 * @param <Pojo>
 */
public abstract class JsonParser<Pojo> implements IJsonParser<Pojo> {
	private String key;
	public JsonParser() {
		Class clazz = SuperClassHunter.get().acqClass(this);
		if(clazz!=null)
			key = clazz.getSimpleName();
	}

	@Override
	public JSON parse(Pojo t){
		if(t==null) return null;
		return doParse(t);
	}

	
	protected abstract JSON doParse(Pojo t);
	@Override
	public String getKey() {
	
		return key;
	}
	
	

}
