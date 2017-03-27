package com.fastwebx.common.execute.server;

import java.util.ArrayList;
import java.util.List;

import com.fastwebx.common.execute.inf.IExecute;

/**
 * 列表执行,用于类似锁的场景
 * @author mj
 */
public class ListExecutor<Pojo> extends AbsExecute<Pojo>{
	protected List<IExecute> list = new ArrayList<IExecute>();

	@Override
	protected Pojo doExecute(Pojo pojo) {
		Pojo ret = pojo;
		
		for(IExecute e:list){
			ret = (Pojo)e.execute(ret);
		}
		return ret;
	}
	
	@Override
	public Pojo execute(Pojo pojo) {
		
		return doExecute(pojo);
	}

	public ListExecutor<Pojo> add(IExecute e){
		if(e!=null)
			list.add(e);
		return this;
	}
	
	
}
