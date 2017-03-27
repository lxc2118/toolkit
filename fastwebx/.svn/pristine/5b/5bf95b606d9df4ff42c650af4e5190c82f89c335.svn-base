package com.fastwebx.db.condition.creater;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.annotation.CdtInit;


public abstract class CdtCreater {
	abstract public Condition create(String methodName,CdtInit cdtInit,Object value);
	abstract public boolean filte(CdtInit cdtInit,Object value);
	protected String getOp(String old,CdtInit cdtInit){
		if(cdtInit==null 
				|| cdtInit.op().equals("")) return old;
		return cdtInit.op();
		
	}
	protected String getColName(String methodName,CdtInit cdtInit){
		if(cdtInit!=null && !cdtInit.colName().equals("")) return cdtInit.colName();
		return getColNameByMethod(methodName);
	}
	
	private String getColNameByMethod(String methodName){
		StringBuffer sb = new StringBuffer();
		sb.append(methodName.substring(3,4).toLowerCase());
		sb.append(methodName.substring(4));
		return sb.toString();
	}
}
