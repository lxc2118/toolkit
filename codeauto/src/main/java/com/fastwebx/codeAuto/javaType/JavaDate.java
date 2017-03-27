package com.fastwebx.codeAuto.javaType;

import java.util.List;


public class JavaDate extends JavaType {

	
	public JavaDate(){
		this.setName("Date");
	}

	@Override
	public String getImpClass() {
		return "java.util.Date";
	}

	@Override
	public String getJdbcType() {
		return "TIMESTAMP";
	}
	
	
}
