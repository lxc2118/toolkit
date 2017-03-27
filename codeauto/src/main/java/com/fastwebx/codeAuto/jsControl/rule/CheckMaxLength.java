package com.fastwebx.codeAuto.jsControl.rule;

public class CheckMaxLength extends Rule{
	private int len;
	
	public CheckMaxLength(int len) {
		super();
		this.len = len;
	}

	@Override
	public String toString() {
		return "new CheckMaxLength({length:"+len+"})";
	}
	
}
