package com.fastwebx.codeAuto.codeCreater;

import org.apache.velocity.VelocityContext;

import com.fastwebx.codeAuto.codeCreater.base.TableCode;
import com.fastwebx.codeAuto.context.Context;
import com.fastwebx.codeAuto.pojo.Table;
import com.fastwebx.codeAuto.util.NameUtil;

public class IbatisCode extends TableCode{
	private String pojoPkg;

	public String getPojoPkg() {
		return pojoPkg;
	}

	public void setPojoPkg(String pojoPkg) {
		this.pojoPkg = pojoPkg;
	}

	@Override
	protected String buildPath(Table table) {
		return "src/main/resources/ibatis/"
				+NameUtil.get().firstUpperPasical(table.getName())
				+"_sql.xml";
	}

	@Override
	protected VelocityContext buildTableContext(Table table) {
		VelocityContext ret= super.buildTableContext(table);
		if(pojoPkg==null){
			pojoPkg = Context.getPkgName();
		}
		ret.put("pojoPkg", pojoPkg);
		return ret;
	}
	
}
