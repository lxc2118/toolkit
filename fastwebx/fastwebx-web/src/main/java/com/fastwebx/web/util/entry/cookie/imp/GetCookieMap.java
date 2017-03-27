package com.fastwebx.web.util.entry.cookie.imp;

import java.util.HashMap;

import com.fastwebx.web.util.entry.cookie.AbsCookieProcess;

/**
 * @author mj
 */
public class GetCookieMap extends AbsCookieProcess{
	private HashMap<String, String> map = new HashMap<>();
	@Override
	protected void doProcess(String key, String value) {
		map.put(key, value);
	}
	public HashMap<String, String> getMap() {
		return map;
	}
	
}
