package com.fastwebx.common.execute.server;

import com.fastwebx.common.execute.inf.IExecute;

/**
 * 链式调用
 * 非线程安全
 * @author mj
 */
public abstract class LinkExecutor<Pojo> extends AbsExecute<Pojo> {
	protected  Pojo after$(Pojo pojo){
		return pojo;
	}
	/**
	 * 真正执行
	 * @param pojo
	 * @return
	 */
	protected abstract Pojo doExecute(Pojo pojo);
	
	protected LinkExecutor<Pojo> next;
	protected LinkExecutor<Pojo> tail;
	protected IExecute<Pojo> executor;
	@Override
	public Pojo execute(Pojo pojo) {
		Pojo ret = pojo;
		LinkExecutor<Pojo> cur = this;
		while(cur!=null){
			ret = cur.doExecute(ret);
			cur = cur.acqNext();
		}
		if(executor!=null){
			ret = executor.execute(ret);
		}
		ret = after$(ret);
		return ret;
	} 
	/**
	 * 返回下一个
	 * @return
	 */
	protected LinkExecutor acqNext(){
		return this.next;
	}
	
	public LinkExecutor<Pojo> set(IExecute execute){
		this.executor = execute;
		return this;
	}
	
	public LinkExecutor<Pojo> addNext(LinkExecutor execute){
		if(execute!=null){
			if(this.tail==null){
				this.next = execute;
			}else{
				this.tail.next = execute;
			}
			this.tail = execute;
		}
		return this;
	}
	
	
}
