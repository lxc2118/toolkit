package com.fastwebx.common.exp;

import com.fastwebx.common.inf.IHasCode;

public class AlreadyExist extends RuntimeException implements IHasCode{
	@Override
	public String getMessage() {
		return message;
	}
	
	public AlreadyExist(String message) {
		if(message!=null)
			this.message = message;
	}
	public AlreadyExist(){
		
	}
	
	
	
	@Override
	public int getCode() {
		return 900;
	}



	private String message="当前记录已存在";
}
