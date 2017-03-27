package com.fastwebx.test.hero.dao;

import com.fastwebx.common.context.$;
import com.fastwebx.db.condition.OrCdt;
import com.fastwebx.db.condition.SqlCdt;
import com.fastwebx.db.condition.util.CdtUtil;
import com.fastwebx.db.query.Query;
import com.fastwebx.db.test.TestBase;
import com.fastwebx.test.hero.pojo.Hero;

import junit.framework.TestCase;

public class HeroDaoTest extends TestBase {
	private HeroDao dao;
	public HeroDaoTest(){
		dao = $.get(HeroDao.class);
	}
	
	public void testFindAll(){
		for(Hero hero : dao.findAll()){
			System.out.println(hero.getHname());
		}
	}
	public void testAdd(){
		Hero hero = new Hero();
		hero.setHname("张无忌1");
		hero.setMid(2);
		dao.add(hero);
		
	}
	public void testUpdate(){
		Hero hero = dao.get(27);
		hero.setHname("孙尚香");
		hero.setMid(2);
		dao.update(hero);
		
	}
	
	public void testDel(){
		Hero hero = dao.get(6);
		
		dao.del(hero);
		
	}
	public void testFind(){
		Query query = new Query();
		query.inTable("menpai")
			.col("mid")
				.eq("mname", "丐帮");
		for(Hero hero:dao.find(query)){
			
			System.out.println(hero.getHname());
		}
		
	}
	
	public void testFind2(){
		Query query = new Query();
		query.eq("hname", "郭靖")
			.big("hid", 2)
			.in("hid", new Integer[]{1,2})
			.inTable("menpai")
				.col("mid");
		SqlCdt sqlCdt = new SqlCdt("1=2");
		query.add(sqlCdt);
	
		//OrCdt orCdt  = new OrCdt();
		//orCdt.add(CdtUtil.big(column, value))
		for(Hero hero:dao.find(query)){
			
			System.out.println(hero.getHname());
		}
		
	}
}
