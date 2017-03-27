package com.fastwebx.db.dao.event;

import com.fastwebx.common.bus.event.SplEvent;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.db.dao.changeType.ChangeType;
import com.fastwebx.db.dao.changeType.ChangeTypeFac;

public class PojoChange extends SplEvent<IPk>{
	protected ChangeType changeType;
	
	
	public ChangeType getChangeType() {
		return changeType;
	}

	public void setChangeType(ChangeType changeType) {
		this.changeType = changeType;
	}

	public PojoChange(IPk props,ChangeType actType){
		super(props);
		this.changeType = actType;
	
	}
	
	public PojoChange(IPk props){
		super(props);
		this.changeType = ChangeTypeFac.blank;
	
	}
	
	public void process(PojoChange pojoChange){
		pojoChange.param = this.param;
		if(this.changeType!=null)
			this.changeType.process(pojoChange);
	}
	
	public String getKey(){
		if(this.param!=null)
			return this.param.getClass().getSimpleName();
		return null;
	}
	
	public boolean isValid(){
		if(this.changeType==null) return false;
		return this.changeType.isValid();
	}
}
