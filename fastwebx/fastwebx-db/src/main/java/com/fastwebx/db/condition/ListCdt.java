package com.fastwebx.db.condition;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListCdt extends ValueCdt {
	private static final long serialVersionUID = 1L;
	public Collection getValues() {
		return values;
	}



	@Override
	public boolean getSingleValue() {
		return false;
	}

	
	
	public ListCdt(String col, String op, Collection values) {
		super(col,op);
		this.values = values;
	}
	
	
	public ListCdt(String col, Collection values) {
		super(col,"in");
		
		this.values = values;
	}
	
	public ListCdt(String col, Object[] values) {
		super(col,"in");
		this.values = new ArrayList(); 
		for(Object obj:values){
			this.values.add(obj);
		}
	}
	public ListCdt(String col,String op, Object[] values) {
		super(col,op);
		this.values = new ArrayList(); 
		for(Object obj:values){
			this.values.add(obj);
		}
	}
	
	private Collection values;
}
