package com.fastwebx.db.condition;


/**
 * ***************************
 * 创建日期: 2013-6-5
 * 创建作者：管敏杰
 * 功能：单值
 ****************************
 */
public class SingleCdt extends ValueCdt {
	private static final long serialVersionUID = 1L;
	@Override
	public boolean getSingleValue() {
		return true;
	}

	
	public SingleCdt(String col, String op, Object value) {
		super(col,op);
		this.value = value;
	}
	
	public SingleCdt(String col, Object value) {
		super(col,"=");
		this.value = value;
	}
	
	
	public Object getValue() {
		return value;
	}


	public void setValue(Object value) {
		this.value = value;
	}


	private Object value;
	


	

}
