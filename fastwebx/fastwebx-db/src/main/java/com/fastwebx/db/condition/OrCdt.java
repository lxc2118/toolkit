package com.fastwebx.db.condition;

public class OrCdt extends ComplexCdt {

	@Override
	public String getSeparator() {
		return " or ";
	}
	
	public OrCdt or(SimpleCdt cdt){
		this.add(cdt);
		return this;
	}
	
}
