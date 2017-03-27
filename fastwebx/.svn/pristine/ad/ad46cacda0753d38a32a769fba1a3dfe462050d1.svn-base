package com.fastwebx.test.web.schParam;

import java.util.List;

import com.fastwebx.common.context.$;
import com.fastwebx.db.test.TestBase;
import com.fastwebx.test.hero.dao.HeroDao;
import com.fastwebx.test.hero.pojo.Hero;

import junit.framework.TestCase;

public class SchHeroParamTest extends TestBase {
	public void testFind(){
		SchHeroParam param = new SchHeroParam();
		param.setMname("丐帮");
		List<Hero> list = $.get(HeroDao.class).find(param.buildQuery());
		for(Hero hero:list)
			System.out.println(hero.getHname());
	}
}
