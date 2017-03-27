package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

import junit.framework.TestCase;

public class WhereClauseTest extends TestBase {
	public void testProcess(){ 
		
		WhereClause code = $.get(WhereClause.class);
		code.process();
	}
}
