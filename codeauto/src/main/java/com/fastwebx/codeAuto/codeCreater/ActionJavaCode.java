package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.codeAuto.context.Context;
import com.fastwebx.codeAuto.pojo.Table;
import com.fastwebx.codeAuto.util.NameUtil;

public class ActionJavaCode extends JavaCode {

	@Override
	protected String getFullPkg(Table table) {
		
		StringBuffer sb = new StringBuffer();
		sb.append(Context.getPkgName());
		sb.append(".web.");
		sb.append(NameUtil.get().pasical(table.getName()));
		
		return sb.toString();
	}
	
}
