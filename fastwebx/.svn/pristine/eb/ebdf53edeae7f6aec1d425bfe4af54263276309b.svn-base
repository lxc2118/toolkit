package com.fastwebx.web;

import com.fastwebx.common.dao.ICrud;
import com.fastwebx.web.base.JsonCtrl;
/**
 * 有点话update 没有的话进行add
 * @author mj
 *
 * @param <Pojo>
 */
public abstract class SaveCtrl<Pojo> extends JsonCtrl<Pojo,ICrud<Pojo>>{

	
	
	@Override
	protected Object doExecute(Pojo param) {
		Pojo pojo = acqPojo(param);
		if(pojo !=null){
			copyPojo(param,pojo);
			update(pojo);
			return pojo;
		}else{
			add(param);
			return param;
		}
	}

	public void update(Pojo pojo){
		this.acqDao().update(pojo);
	}
	public void add(Pojo pojo){
		this.acqDao().add(pojo);
	}
	abstract public Pojo acqPojo(Pojo param);
	
	abstract public void copyPojo(Pojo src,Pojo target);

	@Override
	protected Pojo refresh(Pojo param) {
		
		return param;
	}
	
	
	
}
