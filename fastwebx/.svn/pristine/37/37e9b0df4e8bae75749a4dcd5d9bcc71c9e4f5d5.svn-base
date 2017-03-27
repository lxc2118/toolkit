package com.fastwebx.db.condition.creater;

import java.util.Collection;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.ListCdt;
import com.fastwebx.db.condition.SqlCdt;
import com.fastwebx.db.condition.annotation.CdtInit;


public class ListCreater extends CdtCreater {

	@Override
	public Condition create(String methodName, CdtInit cdtInit, Object value) {
		if(value instanceof Object[]){
			return new ListCdt(
				this.getColName(methodName, cdtInit),
				this.getOp("in", cdtInit),
				(Object[])value
			);
		}else{
			return new ListCdt(
					this.getColName(methodName, cdtInit),
					this.getOp("in", cdtInit),
					(Collection)value
				);
		}
	}

	@Override
	public boolean filte(CdtInit cdtInit, Object value) {
		return value instanceof Collection || value instanceof Object[];
	}

}
