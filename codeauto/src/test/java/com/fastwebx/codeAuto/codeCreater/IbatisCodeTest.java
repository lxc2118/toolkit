package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;


public class IbatisCodeTest extends TestBase  {
	
	public void testProcess(){
		IbatisCode ibatisCode = $.get(IbatisCode.class);
		ibatisCode.process();
	}
}
