package com.fastwebx.db.condition.hunter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.fastwebx.common.reflect.method.MethodFilter;
import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.annotation.CdtInit;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.SqlCdt;
import com.fastwebx.db.condition.annotation.CdtInit;
import com.fastwebx.db.condition.creater.CdtCreater;
import com.fastwebx.db.condition.creater.ConditionCreater;
import com.fastwebx.db.condition.creater.InTableCreater;
import com.fastwebx.db.condition.creater.JoinCreater;
import com.fastwebx.db.condition.creater.ListCreater;
import com.fastwebx.db.condition.creater.SingleCreater;
import com.fastwebx.db.condition.creater.SqlCreater;
import com.fastwebx.db.condition.hunter.filter.GetAndNeedFilter;


public class CdtHunter {
	public List<Condition> parse(Object obj){
		if(obj==null) return null;
		List<Condition> ret = new ArrayList<Condition>();
		for(Method method:obj.getClass().getMethods()){
			String methodName = method.getName();
			if(needGet.filte(method, methodName)){
				Object value = null;
				try {
					value = method.invoke(obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
				if(value!=null && isNotEmptyString(value)){
					CdtInit cdtInit = method.getAnnotation(CdtInit.class);
					for(CdtCreater creater:list){
						if(creater.filte(cdtInit, value)){
							Condition cdt = creater.create(methodName, cdtInit,value);
							if(cdt!=null){
								ret.add(cdt);
							}
							break;
						}
					}
				}
			}
		}
		return ret;
	}
	private CdtHunter(){
		init();
	}
	protected void init(){
		needGet = new GetAndNeedFilter(); 
		list = new CdtCreater[]{
			new ConditionCreater(),
			new SqlCreater(),
			new JoinCreater(),
			new InTableCreater(),
			new ListCreater(),
			new SingleCreater()
		};
	}
	protected boolean isNotEmptyString(Object value){
		return !(value instanceof String && value.equals(""));
	}
	
	protected MethodFilter needGet;
	protected CdtCreater[] list;
	private static CdtHunter instance = new CdtHunter();
	public static CdtHunter get(){
		return instance;
	}
}
