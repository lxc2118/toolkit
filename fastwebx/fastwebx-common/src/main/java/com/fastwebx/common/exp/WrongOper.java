package com.fastwebx.common.exp;

import com.fastwebx.common.exp.base.ErrorCode;

/**
 * @author mj
 */
public class WrongOper extends ErrorCode{

	@Override
	public String getMessage() {
	
		return "不能执行该操作";
	}
	
}
