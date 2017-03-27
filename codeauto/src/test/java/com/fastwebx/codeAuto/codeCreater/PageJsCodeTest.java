package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class PageJsCodeTest extends TestBase {
	public void testParse(){
		PageJsCode code = $.get(PageJsCode.class);
		code.process();
	}
}
