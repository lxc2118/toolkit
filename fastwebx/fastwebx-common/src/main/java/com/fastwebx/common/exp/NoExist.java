package com.fastwebx.common.exp;

import com.fastwebx.common.inf.IHasCode;

public class NoExist extends RuntimeException implements IHasCode{
	@Override
	public String getMessage() {
		return message;
	}
	
	public NoExist(String message) {
		if(message!=null)
			this.message = message;
	}
	public NoExist(){
		
	}
	@Override
	public int getCode() {
		return 901;
	}
	private String message="当前记录不存在";
	
}
