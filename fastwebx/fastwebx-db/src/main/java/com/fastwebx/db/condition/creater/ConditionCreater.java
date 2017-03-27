package com.fastwebx.db.condition.creater;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.annotation.CdtInit;


public class ConditionCreater extends CdtCreater{

	@Override
	public Condition create(String methodName, CdtInit cdtInit, Object value) {
		return (Condition)value;
	}

	@Override
	public boolean filte(CdtInit cdtInit, Object value) {
		return value instanceof Condition;
	}

}
