package com.fastwebx.common.reflect.valueTrans.imp;

import java.text.DecimalFormat;

import com.fastwebx.common.reflect.valueTrans.ValueTrans;

public class LongTrans implements ValueTrans<Long>{

	@Override
	public String toStr(Long val) {
		
		return val+"";
	}

	@Override
	public Long toObj(String str) {
		
		return Long.parseLong(str);
	}
	
}
