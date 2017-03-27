package com.fastwebx.db.condition.creater;

import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.JoinCdt;
import com.fastwebx.db.condition.ValueCdt;
import com.fastwebx.db.condition.annotation.CdtInit;
import com.fastwebx.db.condition.tableJoin.TableJoin;
import com.fastwebx.db.condition.tableJoin.TwoTable;


public class JoinCreater extends CdtCreater {
	
	@Override
	public Condition create(String methodName, CdtInit cdtInit, Object value) {
		ValueCdt valueCdt = null;
		if(listCreater.filte(cdtInit, value)){
			valueCdt = (ValueCdt)listCreater.create(methodName, cdtInit, value);
		}else{
			valueCdt = (ValueCdt)creater.create(methodName, cdtInit, value);
		}
		JoinCdt ret = new JoinCdt();
		ret.setCdt(valueCdt);
		ret.setTable(createTableJoin(cdtInit));
		return ret;
	}

	public TableJoin createTableJoin(CdtInit cdtInit){
		
		if(cdtInit.middleTableName().equals("")){
			
			TableJoin tableJoin = new TableJoin();
			tableJoin.setTableName(cdtInit.joinTableName());
			tableJoin.setMainTableCol(cdtInit.mainTableCol());
			tableJoin.setJoinTableCol(cdtInit.joinColName());
			return tableJoin;
		}else{
			TwoTable tableJoin = new TwoTable();
			tableJoin.setTableName(cdtInit.joinTableName());
			tableJoin.setMainTableCol(cdtInit.mainTableCol());
			tableJoin.setJoinTableCol(cdtInit.joinColName());
			tableJoin.setMiddleTableName(cdtInit.middleTableName());
			tableJoin.setMiddle2Join(cdtInit.middle2Join());
			tableJoin.setMiddle2Main(cdtInit.middle2Main());
			return tableJoin;
		}
		
	}
	
	@Override
	public boolean filte(CdtInit cdtInit, Object value) {
		return cdtInit != null && !cdtInit.joinTableName().equals("");
	}
	private SingleCreater creater = new SingleCreater();
	private ListCreater listCreater = new ListCreater();
}
