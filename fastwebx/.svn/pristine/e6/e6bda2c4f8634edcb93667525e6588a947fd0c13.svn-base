package com.fastwebx.common.fac;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.fastwebx.common.fac.inf.IHasName;

/**
 * 一个通用的工厂类
 * @author mj
 *
 */
public abstract class AbsFactory<T,Pojo extends IHasName<T> > {

	private HashMap<String,Pojo> hashMap = new HashMap<String,Pojo>();
	protected boolean needDefault = false;
	
	
	
	protected void add(Pojo pojo){
		if(pojo!=null){
			hashMap.put(acqName(pojo.acqName()), pojo);
		}
	}
 
	protected void add(T name,Pojo pojo){
		if(pojo!=null && name!=null){
			hashMap.put(acqName(name), pojo);
		}
	}
 
	protected String acqName(T name){
		return name.toString().toLowerCase();
	}
	/**
	 * 构建默认值
	 * @return
	 */
	protected Pojo buildDefault(){
		return null;
	}
	
	/**
	 * 根据名称返回pojo
	 * @param name
	 * @return
	 */
	public Pojo getByName(T name){
		Pojo ret = null;
		if(name!=null)
			ret=hashMap.get(acqName(name));
		if(ret==null && needDefault){
			ret = buildDefault();
		}
		return ret;
	}
	/**
	 * 返回工厂里面所有对象
	 * @return
	 */
	public Collection<Pojo> getAllPojos(){
		return hashMap.values();
	}
	
	/**
	 * 返回工厂里面所有对象的name
	 * @return
	 */
	public Collection<T> getAllNames(){
		List<T> list = new ArrayList<T>();
		for(Pojo pojo: getAllPojos()){
			list.add(pojo.acqName());
		}
		return list;
	}
}
