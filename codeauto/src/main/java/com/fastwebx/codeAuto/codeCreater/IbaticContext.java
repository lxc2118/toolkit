package com.fastwebx.codeAuto.codeCreater;

import org.springframework.stereotype.Service;

import com.fastwebx.codeAuto.codeCreater.base.ContextCode;

@Service
public class IbaticContext extends ContextCode {

	@Override
	public String buildPath() {
		return "src/main/resources/ibatis/sqlMapConfig.xml";
	}

}
