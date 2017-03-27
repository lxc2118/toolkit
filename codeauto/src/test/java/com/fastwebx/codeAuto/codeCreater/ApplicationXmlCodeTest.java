package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class ApplicationXmlCodeTest extends TestBase {
	public void testProcess(){
		ApplicationXmlCode code = $.get(ApplicationXmlCode.class);
		code.process();
	}
}
