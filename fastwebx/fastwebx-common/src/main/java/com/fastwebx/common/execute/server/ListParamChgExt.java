package com.fastwebx.common.execute.server;

import java.util.ArrayList;
import java.util.List;

import com.fastwebx.common.execute.inf.IExecute;

/**
 * 参数转化类
 * @author mj
 */
public class ListParamChgExt<Pojo,Param> extends AbsExecute<Pojo> {
	private Param param;
	private Param result;
	
	public Param getResult() {
		return result;
	}

	private ListExecutor<Param> executor = new  ListExecutor<Param>();

	public ListParamChgExt(Param p){
		param = p;
	}
	
	@Override
	protected Pojo doExecute(Pojo pojo) {
		Pojo ret = pojo;
		result = executor.execute(param);
		return ret;
	}
	
	@Override
	public Pojo execute(Pojo pojo) {
		
		doExecute(pojo);
		return pojo;
	}

	public ListParamChgExt<Pojo,Param> add(IExecute executor){
		this.executor.add(executor);
		return this;
	}
	
}
