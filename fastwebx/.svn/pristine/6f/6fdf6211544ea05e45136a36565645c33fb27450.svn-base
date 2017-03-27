package com.fastwebx.db.dao.changeType;

import com.fastwebx.db.dao.changeType.imp.*;
import com.fastwebx.db.dao.event.PojoChange;

public abstract class ChangeType {
	protected String name;
	
	public String acqName(){
		return name;
	}
	
	public boolean isValid(){
		return true;
	}
	
	public void process(PojoChange change){
		ChangeType type = change.getChangeType();
		if(type==null) return;
		if(type instanceof Add){
			processAdd(change);
		}
		if(type instanceof Update){
			processUpdate(change);
		}
		if(type instanceof Del){
			processDel(change);
		}
		if(type instanceof Invalid){
			processInvalid(change);
		}
	}
	
	protected void processAdd(PojoChange change){
		
	}
	protected void processUpdate(PojoChange change){
			
	}
		
	protected void processDel(PojoChange change){
		
	}
	protected void processInvalid(PojoChange change){
		
	}
}
