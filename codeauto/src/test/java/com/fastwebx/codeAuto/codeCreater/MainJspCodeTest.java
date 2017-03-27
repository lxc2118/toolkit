package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class MainJspCodeTest extends TestBase {
	public void testParse(){
		MainJspCode code = $.get(MainJspCode.class);
		code.process();
	}
}
