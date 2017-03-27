package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class JsViewCodeTest extends TestBase {
	public void testParse(){
		JsViewCode code = $.get(JsViewCode.class);
		code.process();
	}
}
