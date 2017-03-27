package com.fastwebx.web.json;

import com.alibaba.fastjson.JSON;

/**
 * 将json转成普通类
 * @author mj
 */
public interface IJsonBuilder<T> {
	T build(JSON json);
	String getKey();
}
