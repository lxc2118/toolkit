package com.fastwebx.codeAuto.pojo;

import com.fastwebx.codeAuto.javaType.JavaType;
import com.fastwebx.codeAuto.javaType.JavaTypeExchanger;
import com.fastwebx.codeAuto.jsControl.JsControl;
import com.fastwebx.codeAuto.jsControl.SFDate;
import com.fastwebx.codeAuto.jsControl.SFInput;
import com.fastwebx.codeAuto.util.NameUtil;

public class Column {
	public boolean getNotNull() {
		return notNull;
	}

	public void setNotNull(boolean notNull) {
		this.notNull = notNull;
	}

	
	
	public boolean getAutoIncrease() {
		return autoIncrease;
	}

	public void setAutoIncrease(boolean autoIncrease) {
		this.autoIncrease = autoIncrease;
	}

	public boolean getPk(){
		if(table==null) return false;
		return table.getPks().contains(this);	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		if(type==null) return null;
		return type.toLowerCase();
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public String toString(){
		return this.name;
	}
	public JavaType getJavaType(){
		return JavaTypeExchanger.getJavaType(this.type);
	}
	
	public String getSqlCode(){
		StringBuffer sb = new StringBuffer();
		sb.append(name);
		sb.append("=#{");
		sb.append(NameUtil.get().pasical(name));
		
		sb.append("}");
		return sb.toString();
	}
	
	public String getJsControl(){
		JsControl jsControl = null;
		if(this.type.equalsIgnoreCase("datetime")){
			jsControl = new SFDate();
		}else{
			jsControl = new SFInput();
		}
		jsControl.setColumn(this);
		return jsControl.toString();
	}
	
	private String name;
	private String type;
	private int length;
	private Table table;
	private boolean autoIncrease;
	private boolean notNull;
	
	public String getJdbcType(){
		return this.getJavaType().getJdbcType();
	}
}
