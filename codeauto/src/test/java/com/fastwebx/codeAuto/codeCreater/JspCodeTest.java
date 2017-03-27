package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

import junit.framework.TestCase;

public class JspCodeTest extends TestBase {
	public void testParse(){
		JspCode code = $.get(JspCode.class);
		code.process();
	}
}
