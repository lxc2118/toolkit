package com.fastwebx.codeAuto.codeCreater;

import com.fastwebx.codeAuto.CopySrc;
import com.fastwebx.common.context.$;
import com.fastwebx.common.context.S;
import com.fastwebx.db.test.TestBase;

public class AllCode extends TestBase{
	public void testBuildAll(){
		 $.get(IbatisCode.class).process();
//		 $.get(WhereClause.class).process();
//		 ((JavaCode)$.get("pojo")).process();
//		 ((JavaCode)$.get("dao")).process();
//		 ((JavaCode)$.get("schAction")).process();
//		 ((JavaCode)$.get("updateAction")).process();
//		 ((JavaCode)$.get("delAction")).process();
//		 ((JavaCode)$.get("addAction")).process();
//		 
//		 //$.get(WebxApp1.class).process();
//		 
//		// $.get(IbaticContext.class).process();
//		
//		 
//		 $.get(ApplicationXmlCode.class).process();
//		
//		 //$.get(WebXmlCode.class).process();
//		 
//		 $.get(ServerCode.class).process();
//		 
//		 $.get(JspCode.class).process();
//		 
//		 $.get(JsViewCode.class).process();
//		 
//		 $.get(JsModelCode.class).process();
//		 
//		 $.get(LocalJsCode.class).process();
//		 
//		 $.get(MainJspCode.class).process();
//		 
//		 $.get(MenuCode.class).process();
//		 
//		 $.get(PageJsCode.class).process();
//		 
//		 $.get(DecoratorsCode.class).process();
//		 
//		 S.get(TaglibsCode.class).process();
//		 
		 new CopySrc().execute();
		 //$.get(PomXmlCode.class).process();
		
	}
}
