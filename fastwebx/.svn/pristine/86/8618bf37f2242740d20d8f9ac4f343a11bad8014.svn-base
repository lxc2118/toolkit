package com.fastwebx.web.http.client;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fastwebx.common.exp.imp.CodeExp;
import com.fastwebx.common.util.Md5Util;
import com.fastwebx.common.util.StrUtil;
import com.fastwebx.web.http.result.HttpResult;
import com.fastwebx.web.http.result.imp.DefHttpResult;
import com.fastwebx.web.json.IJsonParser;
import com.fastwebx.web.json.JsonParserContext;
import com.fastwebx.web.json.imp.DefJsonParser;
import com.fastwebx.web.util.HttpUtil;

/**
 * http客户端封装类
 * 用于公司内部各项目的http交互
 * @author mj
 * 
 */
public class HttpClientHelper<T> {
	
	protected static String defaultKey = "sjAdmin1";
	protected String url;	//
	protected String signKey;	//加密串
	protected IJsonParser<T> jsonParser;	//json序列化类
	
	
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSignKey() {
		if(signKey==null) return defaultKey;
		return signKey;
	}

	public void setSignKey(String signKey) {
		this.signKey = signKey;
	}

	public IJsonParser<T> getJsonParser() {
		if(jsonParser==null)
			return  new DefJsonParser();
		return jsonParser;
	}

	public void setJsonParser(IJsonParser<T> jsonParser) {
		this.jsonParser = jsonParser;
	}

	public T post(T t){
		HttpResult hr =  doPost(t);
		if(hr ==null)
			throw new CodeExp("NullHr");
		if(hr.isSucc()){
			return (T)hr.getData();
		}else{
			System.out.println(hr.getErrorCode());
			System.out.println(hr.getMsg());
			throw new CodeExp(hr.getErrorCode(),hr.getMsg());
		}
	}
	
	protected HttpResult doPost(T t){
		Map<String,String> map = this.buildParam(t);
		String result = HttpUtil.post(url, map);
		
		HttpResult hr = this.createHttpResult$(t);
		hr.parse(result);
		return hr;
	}
	
	public T post(String url,T t){
		this.url = url;
		return this.post(t);
	}
	
	public T post2Url(String url){
		this.url = url;
		return this.post(null);
	}
	
	
	
	/**
	 * 设置返回的result
	 * @param t
	 * @return
	 */
	protected HttpResult createHttpResult$(T t) {
		
		return new DefHttpResult();
	}

	protected HashMap<String, String> buildParam(T t){
		String json = toJSON(t);
		String time = System.currentTimeMillis() + "";
		String sign = Md5Util.encode(StrUtil.link(json,time,getSignKey()));
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("json", json);
		map.put("time", time);
		map.put("sign", sign);
		return map;
	} 
	
	protected String toJSON(T t){
		if(t==null) return "";
		jsonParser = this.getJsonParser();
		if(jsonParser!=null)
			return jsonParser.parse(t).toString();
		return JsonParserContext.get().parse(t).toString();
	}
	
}
