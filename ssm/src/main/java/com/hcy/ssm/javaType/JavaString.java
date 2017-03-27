package com.hcy.ssm.javaType;

import java.util.ArrayList;
import java.util.List;


public class JavaString extends JavaType {
	public JavaString(){
		this.setName("String");
	}

	@Override
	public String getJdbcType() {
		return "VARCHAR";
	}

	
	
	
}
