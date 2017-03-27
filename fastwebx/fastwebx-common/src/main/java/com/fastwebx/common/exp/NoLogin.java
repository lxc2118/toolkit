package com.fastwebx.common.exp;

import com.fastwebx.common.inf.IHasCode;

public class NoLogin extends RuntimeException implements IHasCode {

	@Override
	public int getCode() {
		
		return 903;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	public NoLogin(String message) {
		if(message!=null)
			this.message = message;
	}
	public NoLogin(){
		
	}
	
	private String message="没有登录或已经断线，请重新登陆";
}
