package com.hcy.ssm.javaType;

import java.util.ArrayList;
import java.util.List;


public class JavaLong extends JavaType{

	
	public JavaLong(){
		this.setName("Long");
	}

	@Override
	public String getJdbcType() {
		return "BIGINT";
	}
	
	
}
