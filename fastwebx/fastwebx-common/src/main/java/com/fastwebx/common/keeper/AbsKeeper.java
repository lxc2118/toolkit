package com.fastwebx.common.keeper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

import com.fastwebx.common.fac.inf.IHasName;

/**
 * 一个典型的map list结构的keeper
 * @author mj
 *
 */
public class AbsKeeper<T,Pojo extends IHasName<T>> {
	private HashMap<T,List<Pojo>> map = new HashMap<T,List<Pojo>>();
	
	/**
	 * 处理每个元素
	 * @param consumer
	 */
	public void handle(Consumer<Pojo> consumer) {
		if(consumer==null) return;
		List<Pojo> pojos = new ArrayList<>();
		for(List<Pojo> list:this.values()){
			pojos.addAll(list);
		}
		pojos.forEach(consumer);
	}
	
	public void clear(){
		this.map.clear();
	}
	/**
	 * 增加
	 * @param pojo
	 */
	public void add(Pojo pojo){
		acqListByPojo(pojo).add(pojo);
	}
	/**
	 * 容器里面是否有这个记录
	 * @param pojo
	 * @return
	 */
	public boolean contains(Pojo pojo){
		return this.acqListByPojo(pojo).contains(pojo);
	}
	
	/**
	 * 删除
	 * @param pojo
	 */
	public void remove(Pojo pojo){
		acqListByPojo(pojo).remove(pojo);
	}
	/**
	 * 是否存在这一类型的
	 * @param pojo
	 * @return
	 */
	public boolean isExistPojo(Pojo pojo){
		return this.acqList(pojo.acqName()).size()>0;
	}
	
	public boolean isExist(T t){
		return this.acqList(t).size()>0;
	}
	
	
	
	
	public List<Pojo> acqListByPojo(Pojo pojo){
		if(pojo==null) return new ArrayList();
		return acqList(pojo.acqName());
	}
	/**
	 * 返回list
	 * @param t
	 * @return
	 */
	public List<Pojo> acqList(T t){
		List<Pojo> list = map.get(t);
		if(list==null){
			list = new ArrayList<Pojo>();
			map.put(t, list);
		}
		return list;
	}
	
	
	public List<Pojo> findAll(){
		List<Pojo> ret = new ArrayList<Pojo>();
		for(List<Pojo> list:map.values()){
			ret.addAll(list);
		}
		return ret;
	}
	
	public Set<T> keys(){
		return map.keySet();
	}
	
	public Collection<List<Pojo>> values(){
		return map.values();
	}
	
	
}
