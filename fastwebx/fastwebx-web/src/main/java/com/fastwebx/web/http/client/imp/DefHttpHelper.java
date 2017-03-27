package com.fastwebx.web.http.client.imp;

import com.fastwebx.web.http.client.HttpClientHelper;
import com.fastwebx.web.http.result.HttpResult;
import com.fastwebx.web.http.result.imp.ClazzHttpResult;

/**
 * @author mj
 */
public class DefHttpHelper<T> extends HttpClientHelper<T> {
	private Class clazz = null;
	public DefHttpHelper(Class clazz){
		this.clazz = clazz;
	}
	
	@Override
	protected HttpResult createHttpResult$(T t) {
		return new ClazzHttpResult(clazz); 
	}
	
}
