package com.fastwebx.db.condition;

import com.fastwebx.db.condition.tableJoin.TableJoin;
import com.fastwebx.db.query.Query;


public class JoinCdt extends ValueCdt {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public JoinCdt() {
		super("", "");
		
	}

	@Override
	public boolean getSingleValue() {
		return false;
	}

	@Override
	protected String getTableName() {
		if(table!=null)
			return table.getTableName();
		return "";
	}

	@Override
	public void process(Query query) {
		if(table!=null){
			query.addTable(table);
		}
		if(cdt!=null)
			query.add2List(this.cdt);
	}

	public TableJoin getTable() {
		return table;
	}

	public void setTable(TableJoin table) {
		if(table!=null){
			this.table = table;
			if(cdt!=null){
				cdt.setTableName(table.getTableName());
			}
		}
	}
	
	public void setCdt(SimpleCdt cdt){
		if(cdt!=null){
			this.cdt=cdt;
			if(table!=null)
				this.cdt.setTableName(table.getTableName());
		}
	}
	
	
	private TableJoin table;
	private SimpleCdt cdt;
	
	
	
}
