package com.fastwebx.common.execute.server;

import com.fastwebx.common.execute.inf.IExecute;

/**
 * 更改参数的函数
 * 越来越好玩了
 * @author mj
 */
public class ChgExecutor<Pojo,Param> extends LinkExecutor<Pojo> {
	@Override
	protected Pojo after$(Pojo pojo) {
		
		return pojo;
	}
	@Override
	protected Pojo doExecute(Pojo pojo) {
		if(executor!=null){
			result = (Param)executor.execute(param);
		}
		return pojo;
	}
	private IExecute executor;
	private Param param;
	public ChgExecutor(IExecute executor,Param param){
		this.executor = executor;
		this.param = param;
	}
	private Param result;
	
	public Param getResult() {
		return result;
	}

	
}
