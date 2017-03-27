package com.fastwebx.codeAuto.dao;

import com.fastwebx.codeAuto.pojo.Table;
import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

public class TableDaoTest extends TestBase {
	public void testGetTableByName(){
		System.out.println($.get(TableDao.class).get("wugong"));
	}
	 
	public void testAllPk(){
		Table table = ($.get(TableDao.class).get("hero_wugong"));
		System.out.println(table.getAllPk());
	}
}
