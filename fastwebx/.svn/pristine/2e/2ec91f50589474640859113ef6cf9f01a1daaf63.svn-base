package com.fastwebx.web;



import com.fastwebx.common.exp.NoExist;
import com.fastwebx.common.dao.inf.IGeter;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.web.base.BaseCtrl;
import com.fastwebx.web.base.JsonCtrl;

public abstract class MethodCtrl<Pojo> extends JsonCtrl<Pojo,IGeter<Pojo>>{
	
	
	protected Pojo refresh(Pojo pojo){
		Pojo ret = this.acqDao().getByIPk((IPk)pojo);
		if(ret==null)
			throw new NoExist(createErrorMsg(pojo));
		return ret;
	}
	
	protected abstract Object doExecute(Pojo pojo);
}
