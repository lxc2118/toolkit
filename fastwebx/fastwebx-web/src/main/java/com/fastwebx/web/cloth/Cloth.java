package com.fastwebx.web.cloth;

import java.util.function.Function;
import java.util.function.Supplier;

import com.alibaba.fastjson.JSONObject;
import com.fastwebx.db.dao.BaseDao;

/**
 * @author mj
 */
public class Cloth<Pojo> {
	private BaseDao<Pojo> dao;
	
	private Function<Pojo,Object> function;
	
	private String key;
	
	private Object value;
	
	private Supplier<Pojo> supplier;
	
	public Cloth<Pojo> fun(Function<Pojo,Object> fun){
		this.function = fun;
		return this;
	}
	
	public Cloth<Pojo> supplier(Supplier s){
		this.supplier = s ;
		return this;
	}
	
	public Cloth<Pojo> key(String key){
		this.key = key ;
		return this;
	}
	
	public Cloth<Pojo> dao(BaseDao<Pojo> dao){
		this.dao = dao ;
		return this;
	}
	
	public void put(JSONObject json){
		if(json!=null && function!=null && key!=null ){
			Pojo pojo = find();
			if(pojo!=null)
				json.put(key, function.apply(find()));
		}
	}
	
	
	public void put(JSONObject json,String key){
		this.key = key;
		put(json);
	}
	
	public void put(JSONObject json,String key,Function<Pojo,Object> fun){
		this.key = key;
		this.function = fun;
		put(json);
	}
	
	protected Pojo find(){
		if(supplier!=null) return supplier.get();
		return dao.get(value);
	}

	public Cloth<Pojo> val(Object val) {
		this.value = val;
		return this;
	}
}
