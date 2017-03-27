package com.fastwebx.common.exp.imp;

import java.util.List;

import com.fastwebx.common.exp.base.ErrorCode;

/**
 * 乐观锁失败的时候发生
 * @author mj
 */
public class WrongVersion extends ErrorCode{
	private String msg;
	
	
	public WrongVersion(){
		
	}
	
	public WrongVersion(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		if(msg!=null) return msg;
		return "该记录已经被其他人操作";
	}
	
}
