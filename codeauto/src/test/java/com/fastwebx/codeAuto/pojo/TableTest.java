package com.fastwebx.codeAuto.pojo;

import com.fastwebx.codeAuto.dao.TableDao;
import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;

import junit.framework.TestCase;

public class TableTest extends TestBase {
	public void testGetColumns(){
		Table table = $.get(TableDao.class).get("supplier");
		for(Column column:table.getColumns())
			System.out.println(column +":" + column.getPk() + ":" + column.getType() +":" + column.getLength()) ;
	}
	public void testGetPks(){
		Table table = $.get(TableDao.class).get("wugong");
		for(Column column:table.getPks())
			System.out.println(column);
	}
}
