package com.fastwebx.common.mapReduce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * 对一个数据集进行mapreduce，分成不同的list
 * 非线程安全
 * @author mj
 */
public abstract class MapReduce<T,Pojo> {
	private HashMap<T,List<Pojo>> map = new HashMap<T,List<Pojo>>();
	public void add(Pojo pojo){
		if(pojo==null) return;
		T key = acqKey(pojo);
		if(key==null) return;
		get(key).add(pojo);
	}
	
	public List<Pojo> get(T key) {
		List<Pojo> list =map.get(key);
		if(list==null){
			list = new ArrayList<Pojo>();
			map.put(key, list);
		}
		return list;
	}

	public void addAll(Collection<Pojo> pojos){
		if(pojos==null) return ;
		for(Pojo pojo:pojos)
			add(pojo);
	}
	
	public Collection<List<Pojo>> values(){
		return map.values();
	}
	
	public Set<T> keySet(){
		return map.keySet();
	}
	
	
	public abstract T acqKey(Pojo pojo);
}
