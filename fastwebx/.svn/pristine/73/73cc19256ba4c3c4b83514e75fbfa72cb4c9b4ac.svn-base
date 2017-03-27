package com.fastwebx.web;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fastwebx.common.exp.AlreadyExist;
import com.fastwebx.common.reflect.hunter.SuperClassHunter;
import com.fastwebx.common.dao.ICrud;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.web.base.BaseCtrl;
import com.fastwebx.web.base.JsonCtrl;


public abstract class AddCtrl<Pojo> extends JsonCtrl<Pojo,ICrud<Pojo>> {
	protected String[] ingoreProperty = null;
	protected Class clazz;
	protected boolean needCheckExist = false;
	protected boolean needThrowError = true;
	public AddCtrl(){
		initClass();
	}
	protected void initClass(){
		this.clazz = SuperClassHunter.get().acqClass(this);
	}
	
	
	
	@Override
	protected Object doExecute(Pojo param) {
		
		return add(param);
	}
	
	
	
	@Override
	protected Pojo refresh(Pojo param) {
		return param;
	}
	protected Object add( Pojo pojo){
		preProcessAndCheck(pojo);
		if(this.checkExist(pojo)) return pojo;
		Pojo addPojo = this.buildPojo(pojo);
		
		if(addPojo !=null){
			this.acqDao().add(addPojo);
		}
		return buildResult(pojo);
	}
	
	
	protected Object buildResult(Pojo pojo){
		return pojo;
	}
	protected boolean checkExist(Pojo pojo){
		if(needCheckExist){
			if( doCheckExist(pojo)){
				if(this.needThrowError)
					throw new AlreadyExist(this.createErrorMsg(pojo));
				else
					return true;
			}else{
				return false;
			}
		}else{
			return false;
		}
	}
	
	protected boolean doCheckExist(Pojo pojo){
		return this.acqDao().getByIPk((IPk)pojo)!=null;
	}
	
	protected Pojo buildPojo(Pojo pojo){
		if(ingoreProperty==null || ingoreProperty.length==0) 
			return pojo;
		Pojo ret = null;
		
		try {
			ret = (Pojo)clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		BeanUtils.copyProperties(pojo, ret, ingoreProperty);
		return ret;
		
		
	}
}
