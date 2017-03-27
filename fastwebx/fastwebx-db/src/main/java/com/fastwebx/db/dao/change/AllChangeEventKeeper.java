package com.fastwebx.db.dao.change;

import java.util.HashMap;
import java.util.List;



import com.fastwebx.db.dao.changeKeeper.PojoChangeKeeper;
import com.fastwebx.db.dao.event.PojoChange;


public class AllChangeEventKeeper  {
	protected HashMap<String, PojoChangeKeeper> keepMap = new HashMap<String, PojoChangeKeeper>();
	public void add(PojoChange pce){
		if(pce!=null && pce.acqParam()!=null){
			getByName(pce.getKey()).add(pce);
		}
	}
	
	protected PojoChangeKeeper getByName(String name){
		PojoChangeKeeper ret = keepMap.get(name);
		if(ret==null){
			ret = build(name);
			addKeeper(ret);
		}
		return ret;
	}
	
	protected PojoChangeKeeper build(String name){
		return new PojoChangeKeeper(name);
	}
	
	public void addKeeper(PojoChangeKeeper keeper){
		if(keeper!=null){
			keepMap.put(keeper.getKey(), keeper);
		}
	}
	
	public void setList(List<PojoChangeKeeper> keepers){
		if(keepers!=null){
			for(PojoChangeKeeper keeper:keepers)
				addKeeper(keeper);
		}
	}


	
}
