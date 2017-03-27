package com.hcy.ssm.codeCreater;

import org.apache.velocity.VelocityContext;

import com.hcy.ssm.codeCreater.base.TableCode;
import com.hcy.ssm.context.Context;
import com.hcy.ssm.pojo.Table;
import com.hcy.ssm.util.NameUtil;

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
