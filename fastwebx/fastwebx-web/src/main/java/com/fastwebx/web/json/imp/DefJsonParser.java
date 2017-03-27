package com.fastwebx.web.json.imp;

import com.alibaba.fastjson.JSON;
import com.fastwebx.web.json.IJsonParser;

/**
 * @author mj
 */
public class DefJsonParser  implements IJsonParser{

	@Override
	public JSON parse(Object t) {
		
		return (JSON)JSON.toJSON(t);
	}

	@Override
	public String getKey() {
	
		return null;
	}
	
}
