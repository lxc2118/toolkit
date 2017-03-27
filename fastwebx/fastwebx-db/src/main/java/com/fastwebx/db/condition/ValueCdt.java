package com.fastwebx.db.condition;

public abstract class ValueCdt extends SimpleCdt {
	
	@Override
	public String getSql() {
		StringBuffer sb = new StringBuffer();
		if(!tableName.equals("")){
			sb.append(tableName);
			sb.append(".");
		}
		sb.append(col);
		sb.append(" ");
		sb.append(op);
		sb.append(" ");
		return sb.toString();
	}
	private String col;
	private String op;
	
	
	public ValueCdt(String col, String op) {
		super();
		this.col = col;
		this.op = op;
	}
	
	public boolean getHasValue(){
		return true;
	}
	
	abstract public boolean getSingleValue();
	
}
