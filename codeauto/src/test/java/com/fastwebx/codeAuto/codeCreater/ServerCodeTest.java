package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

import junit.framework.TestCase;

public class ServerCodeTest extends TestBase {
	public void testFind(){
		ServerCode code = $.get(ServerCode.class);
		System.out.println(code.getUrl());
	}
}
