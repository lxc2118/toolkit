package com.fastwebx.db.condition.creater;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.SqlCdt;
import com.fastwebx.db.condition.annotation.CdtInit;


public class SqlCreater extends CdtCreater {

	@Override
	public Condition create(String methodName, CdtInit cdtInit, Object value) {
		return new SqlCdt((String) value);
	}

	@Override
	public boolean filte(CdtInit cdtInit, Object value) {
		return cdtInit!=null
				&& cdtInit.sql()
				&& value instanceof String
				&& value != null
				&& !value.equals("");
	}

}
