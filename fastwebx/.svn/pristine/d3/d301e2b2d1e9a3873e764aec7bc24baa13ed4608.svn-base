package com.fastwebx.db.condition.creater;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.SingleCdt;
import com.fastwebx.db.condition.SqlCdt;
import com.fastwebx.db.condition.annotation.CdtInit;


public class SingleCreater extends CdtCreater{

	@Override
	public Condition create(String methodName, CdtInit cdtInit, Object value) {
		
		return new SingleCdt(
			this.getColName(methodName, cdtInit),
			this.getOp("=", cdtInit),
			value
		);
	}

	@Override
	public boolean filte(CdtInit dbInit, Object value) {
		
		return true;
	}
	
}
