package com.fastwebx.upload.exp;

public class UploadException extends RuntimeException {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return getMsg();
	}
	
	public UploadException(String msg){
		this.msg = msg;
	}
	
	
	
}
