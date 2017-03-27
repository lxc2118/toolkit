package com.fastwebx.db.dao.changeType.imp;

import com.fastwebx.db.dao.changeType.ChangeType;
import com.fastwebx.db.dao.changeType.ChangeTypeFac;
import com.fastwebx.db.dao.event.PojoChange;

public class Del extends ChangeType{

	public Del(){
		this.name="del";
	}
	@Override
	protected void processAdd(PojoChange change) {
		change.setChangeType(ChangeTypeFac.invalid);
	}

	@Override
	protected void processUpdate(PojoChange change) {
		change.setChangeType(ChangeTypeFac.del);
	}

}
