package com.fastwebx.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fastwebx.common.exp.NoExist;
import com.fastwebx.common.dao.inf.IGeter;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.web.base.BaseCtrl;
import com.fastwebx.web.base.JsonCtrl;

public abstract class GetPojoCtrl<Pojo> extends JsonCtrl<Pojo,IGeter<Pojo>>{
	protected Pojo doExecute(Pojo pojo){
		
		Pojo ret = doGetPojo(pojo);
		
		if(ret==null)
			throw new NoExist(createErrorMsg(pojo));
		return ret;
	}
	
	protected Pojo doGetPojo(Pojo pojo){
		return this.acqDao().getByIPk((IPk)pojo);
	}

	@Override
	protected Pojo refresh(Pojo param) {
		return param;
	}
	
}
