package com.fastwebx.common.reflect.valueTrans.imp;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fastwebx.common.reflect.valueTrans.ValueTrans;

public class DateTrans implements ValueTrans<Date>{

	@Override
	public String toStr(Date val) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(val);
	}

	@Override
	public Date toObj(String str) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		try {
			return df.parse(str);
		} catch (ParseException e) {
			return null;
		}
	}
	
}
