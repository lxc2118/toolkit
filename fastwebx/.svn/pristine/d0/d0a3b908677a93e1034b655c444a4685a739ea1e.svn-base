package com.fastwebx.db.condition;

public class SqlCdt extends SimpleCdt{
	public String getSql() {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		sb.append(sql);
		sb.append(")");
		return sb.toString();
	}

	
	public SqlCdt(String sql) {
		super();
		this.sql = sql;
	}
	private String sql;

}
