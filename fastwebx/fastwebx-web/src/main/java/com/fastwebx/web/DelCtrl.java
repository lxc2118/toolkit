package com.fastwebx.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fastwebx.common.dao.ICrud;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.exp.NoExist;
import com.fastwebx.web.base.BaseCtrl;
import com.fastwebx.web.base.JsonCtrl;


public abstract class DelCtrl<Pojo> extends JsonCtrl<Pojo,ICrud<Pojo>> {
	protected String[] ingoreProperty = null;
	protected boolean needThrowError = true;
	protected String noExistMsg = null;
	protected boolean needGet = false;
	
	
	
	
	@Override
	protected Pojo refresh(Pojo param) {
		
		return param;
	}










	@Override
	protected Object doExecute(Pojo param) {
		return del(param);
	}


	protected Pojo buildDelPojo(Pojo pojo){
		return pojo;
	}
	
	public  Object del(Pojo pojo){
		pojo = buildDelPojo(pojo);
		if(needGet){
			pojo = acqDao().getByIPk((IPk)pojo);
			if(pojo == null)
				throw new NoExist(createErrorMsg(pojo));
		}
		int cnt = 0;
		cnt = this.acqDao().del(pojo);
		if(cnt==0){
			if(this.needThrowError)
				throw new NoExist(createErrorMsg(pojo));
		}else{
			doAfterDel(pojo);
		}
		return buildResult(pojo);
	}
	
	protected Object buildResult(Pojo pojo){
		return pojo;
	}
	
	protected void doAfterDel(Pojo pojo){
		
	}
}
