package com.fastwebx.common.exp.imp;

import com.fastwebx.common.exp.base.ErrorCode;
import com.fastwebx.common.util.StrUtil;

/**
 * @author mj
 */
public class FastExp extends ErrorCode{
	private Exception exp;

	public FastExp(Exception exp){
		this.exp = exp;
	}

	@Override
	public String acqCode() {
		if(exp==null) return null;
		return exp.getClass().getSimpleName();
	}

	@Override
	public String getMessage() {
		if(exp==null) return null;
		return exp.getMessage();
	}
	
	
	
}
