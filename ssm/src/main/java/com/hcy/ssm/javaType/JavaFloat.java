package com.hcy.ssm.javaType;

import java.util.ArrayList;
import java.util.List;


public class JavaFloat extends JavaType{

	
	@Override
	public String getJdbcType() {
		return "DOUBLE";
	}

	public JavaFloat(){
		this.setName("Float");
	}
}
