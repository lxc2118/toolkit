package com.fastwebx.common.exp;

import com.fastwebx.common.inf.IHasCode;

public class NoRight extends RuntimeException implements IHasCode{
	@Override
	public String getMessage() {
		return message;
	}
	
	public NoRight(String message) {
		if(message!=null)
			this.message = message;
	}
	public NoRight(){
		
	}
	@Override
	public int getCode() {
		return 902;
	}
	private String message="您没有权限做该操作";
	
}
