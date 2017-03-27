package com.fastwebx.codeAuto.codeCreater;

import org.apache.velocity.VelocityContext;
import org.springframework.stereotype.Service;

import com.fastwebx.codeAuto.codeCreater.base.ContextCode;
import com.fastwebx.codeAuto.context.Context;
@Service
public class ApplicationXmlCode extends ContextCode {
	@Override
	protected VelocityContext buildContext() {
		
		VelocityContext ret = super.buildContext();
		ret.put("pkgName", Context.getPkgName());
		ret.put("useTddl", Context.getUseTddl());
		return ret;
	}

	@Override
	public String buildPath() {
		return "src/main/resources/applicationContext.xml";
	}
	
}
