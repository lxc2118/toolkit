package com.fastwebx.web.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public interface IJsonParser<T> {
	JSON parse(T t);
	String getKey();

}
