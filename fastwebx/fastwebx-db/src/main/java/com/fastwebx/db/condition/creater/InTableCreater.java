package com.fastwebx.db.condition.creater;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.InTableCdt;
import com.fastwebx.db.condition.ListCdt;
import com.fastwebx.db.condition.SingleCdt;
import com.fastwebx.db.condition.annotation.CdtInit;


public class InTableCreater extends CdtCreater{
	private ListCreater listCreater = new ListCreater();
	private SingleCreater singleCreater = new SingleCreater();
	@Override
	public Condition create(String methodName, CdtInit cdtInit, Object value) {
		InTableCdt cdt = new InTableCdt(cdtInit.inTableName());
		cdt.setCol(cdtInit.inTableCol());
		cdt.setMainTableCol(cdtInit.mainTableCol());
		cdt.setDistinct(cdtInit.distinct());
		if(listCreater.filte(cdtInit, value)){
			cdt.add((ListCdt)listCreater.create(methodName, cdtInit, value));
		}else{
			cdt.add((SingleCdt)singleCreater.create(methodName, cdtInit, value));
		}
		return cdt;
	}

	@Override
	public boolean filte(CdtInit cdtInit, Object value) {
		return cdtInit!=null && !cdtInit.inTableName().equals("");
	}
	
}
