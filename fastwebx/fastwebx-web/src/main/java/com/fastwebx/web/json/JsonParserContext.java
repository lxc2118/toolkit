package com.fastwebx.web.json;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.web.inf.IToJSON;
import com.fastwebx.web.util.JsonHelpUtil;
import com.fastwebx.web.util.JsonUtil;

/**
 * json解析器
 * @author mj
 *
 */
public class JsonParserContext {
	private static JsonParserContext instance = new JsonParserContext();
	private HashMap<String, IJsonParser> parserMap = new HashMap<String, IJsonParser>();
	private String dateFormat = null;
	
	public String getDateFormat() {
		return dateFormat;
	}

	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}

	public void add(IJsonParser parser ){
		if(parser!=null)
			parserMap.put(parser.getKey(), parser);
	}
	
	public void setList(Collection<IJsonParser> list){
		
		if(list!=null){
			for(IJsonParser parser:list){
				add(parser);
			}
		}
	}
	
	public static JsonParserContext get(){
		return instance;
	}
	
	
	
	private JsonParserContext(){
		
	}
	
	public JSON parse(Object obj){
		if(obj==null) return null;
		if(obj instanceof JSON)
			return (JSON)obj;
		if(obj instanceof IToJSON){
			return ((IToJSON)obj).toJson();
		}
		String key = null;
		if(obj instanceof IHasJsonParser){
			key = ((IHasJsonParser)obj).acqJsonParser();
		}else{
			key = obj.getClass().getSimpleName();
		}
		IJsonParser parser = parserMap.get(key);
		if(parser!=null)
			return parser.parse(obj);
		else{
			if(obj instanceof JSON)
				return (JSON)obj;
			if(obj instanceof IToJSON){
				return ((IToJSON)obj).toJson();
			}
			if(dateFormat==null)
				return (JSON)JSON.toJSON(obj);
			else
				return JSON.parseObject(JSON.toJSONStringWithDateFormat(obj,dateFormat));
		}
	}
	
	public JSONArray parseArray(Collection collection){
		if(collection==null) return null;
		JSONArray array = new JSONArray();
		for(Object obj:collection){
			array.add(parse(obj));
		}
		return array;
	}

	public JSONObject parseArrayResult(Collection list) {
		
		return JsonHelpUtil
				.put("result", parseArray(list))
				.get();
	}

}
