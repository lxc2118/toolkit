package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class WebXmlCodeTest extends TestBase {
	public void testParse(){
		WebXmlCode code = $.get(WebXmlCode.class);
		code.process();
	}
}
