package com.fastwebx.test.query;

import java.util.List;

import com.fastwebx.common.context.$;
import com.fastwebx.db.query.Query;
import com.fastwebx.db.test.TestBase;
import com.fastwebx.test.hero.dao.HeroDao;
import com.fastwebx.test.hero.pojo.Hero;

public class QueryTest extends TestBase {
	public  void testFind(){
		Query query = new Query();
		query.eq("hname", "郭靖");
		
		HeroDao dao = $.get(HeroDao.class);
		List<Hero> list = dao.find(query);
		for(Hero hero:list){
			System.out.println(hero.getHname());
		}
	}
	public  void testFind2(){
		Query query = new Query();
		query.eq("hname", "郭靖")
			.in("hid", new Integer[]{1,2,3});
		
		HeroDao dao = $.get(HeroDao.class);
		List<Hero> list = dao.find(query);
		for(Hero hero:list){
			System.out.println(hero.getHname());
		}
	}
	
	public void testFindInTable(){
		Query query = new Query();
		query.eq("hname", "aaa")
			.inTable("menpai")
				.col("mid")
				.eq("mname", "无党派");
		HeroDao dao = $.get(HeroDao.class);
		List<Hero> list = dao.find(query);
		for(Hero hero:list){
			System.out.println(hero.getHname());
		}
	}
}
