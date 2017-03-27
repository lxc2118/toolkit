package com.fastwebx.web;

import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fastwebx.common.dao.ICrud;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.exp.NoExist;
import com.fastwebx.web.base.BaseCtrl;
import com.fastwebx.web.base.JsonCtrl;

public abstract class UpdateCtrl<Pojo> extends JsonCtrl<Pojo,ICrud<Pojo>> {
	protected String[] ingoreProperty = null;
	protected String noExistMsg = null;
	protected  Object doExecute(Pojo updatePojo){
		int cnt = 0;
		
		if(updatePojo !=null)
			cnt = this.acqDao().update(updatePojo);
		if(cnt==0)
			throw new NoExist(createErrorMsg(updatePojo));
		return buildResult(updatePojo);
	}
	
	protected Object buildResult(Pojo pojo){
		return pojo;
	}
	
	protected Pojo refresh(Pojo pojo){
		if(ingoreProperty==null || ingoreProperty.length==0) 
			return pojo;
		Pojo ret = this.acqDao().getByIPk((IPk)pojo);
		if(ret != null){
			copy(pojo, ret);
		}
		return ret;
		
	}
	
	protected void copy(Pojo newPojo,Pojo oldPojo){
		BeanUtils.copyProperties(newPojo, oldPojo,ingoreProperty);
	}
}
