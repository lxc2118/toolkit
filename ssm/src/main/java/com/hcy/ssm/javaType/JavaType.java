package com.hcy.ssm.javaType;

import java.util.ArrayList;
import java.util.List;

public abstract class JavaType {
	
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getImpClass(){
		return "";
	}

	abstract public String getJdbcType();
	
}
