package com.hcy.ssm.javaType;
/**
 * @author mj
 */
public class JavaDouble extends JavaType{
	public JavaDouble(){
		this.setName("Double");
	}

	@Override
	public String getJdbcType() {
		return "DOUBLE";
	}
	
}
