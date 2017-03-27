package com.fastwebx.db.dao.saveTactics.impl;

import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.db.dao.saveTactics.SaveTactics;


public class PkTactics extends SaveTactics{

	@Override
	public boolean needAdd(Object pojo) {
		if(!(pojo instanceof IPk)) return true;
		
		return ((IPk)pojo).acqPk()==null;
	}

	

}
