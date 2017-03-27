package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

import junit.framework.TestCase;

public class IbaticContextTest extends TestBase {
	public void testProcess(){
		IbaticContext code = $.get(IbaticContext.class);
		code.process();
	}
}
