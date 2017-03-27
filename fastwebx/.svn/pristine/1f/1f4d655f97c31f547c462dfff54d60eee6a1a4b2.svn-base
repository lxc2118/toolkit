package com.fastwebx.common.valueHolder.inf;

import java.util.Map;

import com.fastwebx.common.valueHolder.IValueHolder;



public class MapHolder implements IValueHolder{
	private Map map;
	
	public MapHolder(Map map) {
	
		this.map = map;
	}

	@Override
	public Object get(String key) {
		
		return map.get(key);
	}

	@Override
	public Object set(String key, Object t) {
		map.put(key, t);
		return t;
	}

	@Override
	public void remove(String key) {
		map.remove(key);
	}

	@Override
	public boolean containsKey(String key) {
	
		return map.containsKey(key);
	}
	
	

}
