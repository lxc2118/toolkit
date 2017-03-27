package com.fastwebx.web.helper;

import com.alibaba.fastjson.JSONObject;
import com.fastwebx.common.reflect.method.util.MethodUtil;
import com.fastwebx.db.dao.BaseDao;

/**
 * 方便穿衣服的帮助类
 * @author mj
 */
public class ClothHelp {
	
	private String colName;	
	private Object schValue; //查询值
	private BaseDao dao;
	private String key;
	private Object schResult;
	private boolean sched;
	private Object get(){
		if(!sched){
			sched = true;
			if(schValue!=null){
				schResult = dao.get(schValue);
			}
		}
		return schResult;
	}
	public ClothHelp process(JSONObject json){
		return put(json,this.getKey(),getColName());
	}
	
	public ClothHelp put(JSONObject json,String key){
		return put(json,key,key);
	}
	/**
	 * 将查询结果放到json中
	 * @param json
	 * @param key
	 * @param valueKey
	 * @return
	 */
	public ClothHelp put(JSONObject json,String key,String valueKey){
		Object obj = dao.get(schValue);
		if(obj!=null){
			json.put(key, MethodUtil.get(obj, valueKey));
		}
		return this;
	}
	
	
	public ClothHelp exist(JSONObject json){
		Object obj = dao.get(schValue);
		if(obj!=null){
			json.put(key, true);
		}
		return this;
	}
	private String getColName() {
		if(colName!=null) return colName;
		return "name";
	}
	private String getKey() {
		if(key!=null) return key;
		return getColName();
	}

	public ClothHelp colName(String colName){
		this.colName = colName;
		return this;
	}
	public ClothHelp schValue(Object schValue){
		this.schValue = schValue;
		return this;
	}
	public ClothHelp dao(BaseDao dao){
		this.dao = dao;
		return this;
	}
	
	public ClothHelp key(String key){
		this.key = key;
		return this;
	}
}
