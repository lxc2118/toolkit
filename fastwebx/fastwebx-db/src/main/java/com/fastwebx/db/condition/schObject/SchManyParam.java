package com.fastwebx.db.condition.schObject;

import java.util.List;


import java.util.Map;

import com.fastwebx.common.context.$;
import com.fastwebx.common.dao.inf.IScher;
import com.fastwebx.common.util.ObjectUtil;
import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.annotation.NoCdt;
import com.fastwebx.db.condition.util.CdtUtil;
import com.fastwebx.db.query.Query;

public abstract class SchManyParam  extends SchParam{
	
	public SchManyParam(){
		this.needCloth = true;
	}
	
	
	public void wearCloth(Map map, Object pojo) {
		if(acqPk()!=null)
			map.put("selected", acqDao().findCnt(
					new Query()
						.eq(acqPkCol(), acqPk())
						.eq(acqCol(), acqColValue(pojo)))>0
			);
	}
	
	protected Object acqColValue(Object obj){
		return ObjectUtil.get(obj, this.acqCol());
	}
	
	public Condition getSelCondition(){
		Object pk = acqPk();
		if(selected!=null && pk!=null){
			List list = acqDao().find(new Query().eq(acqPkCol(),acqPk()));
			
			return build(acqCol(), list,selected);
		}
		return null;
	}
	
	protected Condition build(String col,List list,Boolean sel){
		return CdtUtil.in(col, list, col,sel);
	}
	
	public abstract String acqCol();
	
	public abstract String acqPkCol();
	
	public abstract IScher acqDao();
	public abstract Object acqPk();
	@NoCdt
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	private Boolean selected;
}
