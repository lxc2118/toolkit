package com.fastwebx.db.dao.changeKeeper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.fastwebx.common.dao.inf.IJoinPk;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.db.dao.event.PojoChange;

public class PojoChangeKeeper {
	
	public PojoChangeKeeper(String key){
		this.key = key;
	}
	protected String key;
	public String getKey(){
		return key;
	}
	protected HashMap<Object,PojoChange> map = new HashMap<Object,PojoChange>();
	public void add(PojoChange event){
		if(event==null) return;
		IPk ipk = event.acqParam();
		Object pk = getPk(ipk);
		PojoChange old = map.get(pk);
		if(old==null){
			map.put(pk, event);
		}else{
			event.process(old);
		}
	}
	
	protected Object getPk(IPk ipk){
		Object pk = null;
		if(ipk instanceof IJoinPk){
			pk = ((IJoinPk) ipk).acqJoinPk();
		}else{
			pk=ipk.acqPk();
		}
		return pk;
	}
	
	public Collection<PojoChange> acqEvents(){
		List<PojoChange> list = new ArrayList<PojoChange>();
		for(PojoChange pc:map.values()){
			if(pc!=null && pc.isValid())
				list.add(pc);
		}
		return list;
	}
}
