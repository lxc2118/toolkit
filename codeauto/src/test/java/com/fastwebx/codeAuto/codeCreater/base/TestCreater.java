package com.fastwebx.codeAuto.codeCreater.base;

import java.io.StringWriter;

import org.apache.velocity.VelocityContext;

import com.fastwebx.codeAuto.dao.TableDao;
import com.fastwebx.common.context.$;

public class TestCreater extends CodeCreater {

	@Override
	public void process() {
		StringWriter sw = new StringWriter();

		this.getTemplate().merge( this.getVelocityContext(), sw );
		System.out.println(sw.toString());
		
	}

	@Override
	protected VelocityContext getVelocityContext() {
		VelocityContext ret = super.getVelocityContext();
		ret.put("tables", $.get(TableDao.class).getTables());
		return ret;
	}

	
}
