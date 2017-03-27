package com.fastwebx.codeAuto.codeCreater;

import org.apache.velocity.VelocityContext;
import org.springframework.stereotype.Service;

import com.fastwebx.codeAuto.codeCreater.base.ContextCode;
import com.fastwebx.codeAuto.context.Context;
@Service
public class WebxApp1  extends ContextCode {
	@Override
	public String buildPath() {
		return "src/main/webapp/WEB-INF/webx-app1.xml";
	}
	@Override
	protected VelocityContext buildContext() {
		
		VelocityContext ret = super.buildContext();
		ret.put("pkg", Context.getPkgName());
		
		return ret;
	}
}
