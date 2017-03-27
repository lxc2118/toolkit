package com.fastwebx.common.execute.server;
/**
 * 默认的头处理器
 * @author mj
 */
public abstract class HeadExecutor<Pojo> extends LinkExecutor<Pojo> {

	public HeadExecutor(){
		buildNext();
	}
	/**
	 * 构建处理器链
	 */
	protected abstract void buildNext() ;

	@Override
	protected Pojo doExecute(Pojo pojo) {
	
		return pojo;
	}

	@Override
	protected Pojo after$(Pojo pojo) {
		LinkExecutor next = this.acqNext();
		if(next==null) return pojo;
		return (Pojo)next.after$(pojo);
	}
	
	
	
}
