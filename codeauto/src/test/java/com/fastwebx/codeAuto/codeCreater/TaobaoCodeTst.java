package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class TaobaoCodeTst  extends TestBase{

public void testProcess(){ 
		((JavaCode)$.get("pojo")).process();
		$.get(IbatisCode.class).process();
		((JavaCode)$.get("dao")).process();
		
		
		$.get(ApplicationXmlCode.class).process();
		$.get(WhereClause.class).process();
		$.get(IbaticContext.class).process();
	}
}
