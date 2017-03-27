package com.fastwebx.common.reflect.valueTrans.imp;

import java.text.DecimalFormat;

import com.fastwebx.common.reflect.valueTrans.ValueTrans;

public class DoubleTrans implements ValueTrans<Double>{

	@Override
	public String toStr(Double val) {
		DecimalFormat df = new DecimalFormat("#,###.00");
		return df.format(val);
	}

	@Override
	public Double toObj(String str) {
		
		return Double.parseDouble(str);
	}
	
}
