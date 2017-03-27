package com.fastwebx.db.dao.changeType.imp;

import com.fastwebx.db.dao.changeType.ChangeType;
import com.fastwebx.db.dao.changeType.ChangeTypeFac;
import com.fastwebx.db.dao.event.PojoChange;

public class Add extends ChangeType{
	
	public Add(){
		this.name="add";
	}

	@Override
	protected void processDel(PojoChange change) {
		change.setChangeType(ChangeTypeFac.update);
	}

	@Override
	protected void processInvalid(PojoChange change) {
		change.setChangeType(ChangeTypeFac.add);
	}

	
	
}
