package com.hcy.ssm.codeCreater.base;

import java.io.StringWriter;

import org.apache.velocity.VelocityContext;

import com.hcy.ssm.common.S;
import com.hcy.ssm.dao.TableDao;
import com.hcy.ssm.util.FileUtil;

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
		context.put("tables", S.get(TableDao.class).getTables());
		return context;
	}

}
