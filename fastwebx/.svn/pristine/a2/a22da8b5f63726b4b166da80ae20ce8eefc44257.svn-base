package com.fastwebx.common.execute.server;
/**
 * @author mj
 */
public class TExe extends LinkExecutor<Integer>{
	Integer val;
	public TExe(Integer val){
		this.val = val;
	}
	
	@Override
	protected Integer after$(Integer pojo) {
		System.out.println("after::"+pojo);
		return pojo;
	}

	@Override
	protected Integer doExecute(Integer pojo) {
		System.out.println("doExecute::pojo:"+pojo+",val:"+val);
		Integer ret = pojo+val;
		System.out.println(ret);
		return ret;
	}
	
}
