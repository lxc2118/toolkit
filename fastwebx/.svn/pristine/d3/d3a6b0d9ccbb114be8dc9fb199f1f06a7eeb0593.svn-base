package com.fastwebx.common.reflect.valueTrans.imp;

import java.text.DecimalFormat;

import com.fastwebx.common.reflect.valueTrans.ValueTrans;

public class FloatTrans implements ValueTrans<Float>{

	@Override
	public String toStr(Float val) {
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		return df.format(val);
	}

	@Override
	public Float toObj(String str) {
		
		return Float.parseFloat(str);
	}
	
}
