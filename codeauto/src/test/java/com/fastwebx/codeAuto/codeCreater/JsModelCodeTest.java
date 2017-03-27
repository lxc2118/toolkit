package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

import junit.framework.TestCase;

public class JsModelCodeTest extends TestBase {
	public void testParse(){
		JsModelCode code = $.get(JsModelCode.class);
		code.process();
	}
}
