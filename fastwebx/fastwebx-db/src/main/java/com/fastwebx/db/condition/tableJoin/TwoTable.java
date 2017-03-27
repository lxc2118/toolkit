package com.fastwebx.db.condition.tableJoin;

public class TwoTable extends TableJoin {
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof TwoTable))
			return false;
		return obj.hashCode()==this.hashCode();
	}

	@Override
	public String getSql() {
		StringBuffer sb = new StringBuffer();
		sb.append(" inner join ");
		sb.append(middleTableName);
		sb.append(" on t.");
		sb.append(this.getMainTableCol());
		sb.append(" = ");
		sb.append(middleTableName);
		sb.append(".");
		sb.append(this.getMiddle2Main());
		sb.append(" inner join ");
		sb.append(this.tableName);
		sb.append(" on ");
		sb.append(this.tableName);
		sb.append(".");
		sb.append(this.getJoinTableCol());
		sb.append(" = ");
		sb.append(this.middleTableName);
		sb.append(".");
		sb.append(this.getMiddle2Join());
		sb.append(" ");
		return sb.toString();
	}
	@Override
	public String getMainTableCol() {
		if(mainTableCol==null || "".equals(mainTableCol)) return middle2Main;
		return mainTableCol;
	}
	@Override
	public String getJoinTableCol() {
		if(joinTableCol==null || "".equals(joinTableCol)) return middle2Join;
		return joinTableCol;
	}
	
	
	public String getMiddleTableName() {
		return middleTableName;
	}
	public void setMiddleTableName(String middleTableName) {
		this.middleTableName = middleTableName;
	}
	public String getMiddle2Main() {
		return middle2Main;
	}
	public void setMiddle2Main(String middle2Main) {
		this.middle2Main = middle2Main;
	}
	public String getMiddle2Join() {
		return middle2Join;
	}
	public void setMiddle2Join(String middle2Join) {
		this.middle2Join = middle2Join;
	}
	
	protected String middle2Main;
	protected String middle2Join;
	protected String middleTableName;
}
