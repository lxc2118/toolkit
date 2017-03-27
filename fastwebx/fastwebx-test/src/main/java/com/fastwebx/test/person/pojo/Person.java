package com.fastwebx.test.person.pojo;
public class Person  {
	private Integer pid;
	private String pname;
	private Integer did;
	public void setPid(Integer value){
		this.pid=value;
	}
	public Integer getPid(){
		return this.pid;
	}
	public void setPname(String value){
		this.pname=value;
	}
	public String getPname(){
		return this.pname;
	}
	public void setDid(Integer value){
		this.did=value;
	}
	public Integer getDid(){
		return this.did;
	}
}
