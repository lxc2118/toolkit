package com.fastwebx.codeAuto.codeCreater.base;

import java.io.StringWriter;

import org.apache.velocity.VelocityContext;

import com.fastwebx.codeAuto.dao.TableDao;
import com.fastwebx.codeAuto.util.FileUtil;
import com.fastwebx.common.context.$;

public abstract class ContextCode extends CodeCreater {

	abstract public String buildPath();
	
	@Override
	public void process() {
		FileUtil.write(buildPath(), buildContent());

	}
	
	public String buildContent(){
		StringWriter sw = new StringWriter();
		this.getTemplate().merge( this.buildContext(), sw );
		return sw.toString();
	}
	
	protected VelocityContext buildContext(){
		VelocityContext context = this.getVelocityContext();
		context.put("tables", $.get(TableDao.class).getTables());
		return context;
	}

}
