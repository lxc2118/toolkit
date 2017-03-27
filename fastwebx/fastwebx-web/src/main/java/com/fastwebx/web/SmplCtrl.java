package com.fastwebx.web;

import com.fastwebx.web.base.JsonCtrl;

public abstract class SmplCtrl<Param> extends JsonCtrl<Param, Object> {



	@Override
	protected Param refresh(Param param) {
		return param;
	}

	@Override
	public Object acqDao() {
		return null;
	}

	
	
}
