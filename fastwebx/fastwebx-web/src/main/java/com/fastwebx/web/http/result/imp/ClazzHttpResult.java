package com.fastwebx.web.http.result.imp;

import com.alibaba.fastjson.JSONObject;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.web.http.result.HttpResult;
import com.fastwebx.web.json.JsonParserContext;
import com.fastwebx.web.json.imp.builder.JsonBuilder;

/**
 * 对于parseData$ 和 setData2Json$ 均采用默认实现
 * @author mj
 */
public class ClazzHttpResult<D> extends HttpResult<D> {
	private Class clazz ;
	
	public ClazzHttpResult(Class clazz){
		this.clazz = clazz;
	}

	@Override
	protected void parseData$(JSONObject jsonObject) {
		JsonBuilder<D> builder = new JsonBuilder<D>(clazz);
		this.setData((builder.build(jsonObject)));
	}

	@Override
	protected void setData2Json$(JSONObject obj, D data) {
	
		obj.put("data", JsonParserContext.get().parse(data));
	}
	
}
