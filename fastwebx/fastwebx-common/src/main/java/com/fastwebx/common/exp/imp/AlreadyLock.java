package com.fastwebx.common.exp.imp;

import com.fastwebx.common.exp.base.ErrorCode;

/**
 * 已经被其他人锁住
 * @author mj
 */
public class AlreadyLock extends ErrorCode {
private String msg;
	
	public AlreadyLock(){
		
	}
	
	public AlreadyLock(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		if(msg!=null) return msg;
		return "该记录已经被其他人锁住";
	}
}
