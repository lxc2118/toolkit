package com.hcy.ssm.javaType;

import java.util.ArrayList;
import java.util.List;


public class JavaInteger extends JavaType {

	
	
	public JavaInteger(){
		this.setName("Integer");
	}

	@Override
	public String getJdbcType() {
		return "INTEGER";
	}
}
