package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class PomXmlCodeTest extends TestBase {
	public void testParse(){
		PomXmlCode code = $.get(PomXmlCode.class);
		code.process();
	}
}
