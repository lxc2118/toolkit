package com.fastwebx.web.http.result.imp;

import com.alibaba.fastjson.JSONObject;
import com.fastwebx.web.http.result.HttpResult;
import com.fastwebx.web.json.JsonParserContext;

/**
 * 默认的设置数据
 * @author mj
 */
public class DefClazzHttpResult extends HttpResult {
	@Override
	protected void setData2Json$(JSONObject obj, Object data) {
	
		obj.put("data", JsonParserContext.get().parse(data));
	}
}