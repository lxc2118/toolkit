package com.fastwebx.test.person.dao;


import com.fastwebx.common.context.SpringContext;
import com.fastwebx.db.condition.InTableCdt;
import com.fastwebx.db.condition.SingleCdt;
import com.fastwebx.db.condition.hunter.CdtHunter;
import com.fastwebx.db.query.Query;
import com.fastwebx.db.test.TestBase;
import com.fastwebx.test.person.pojo.Person;

import junit.framework.TestCase;

public class PersonDaoTest extends TestBase {
	public void testFindAll(){
		PersonDao dao = SpringContext.getBean(PersonDao.class);
		for(Person person:dao.findAll()){
			System.out.println(person.getPname());
		}
	}
	public void testInTable(){
		PersonDao dao = SpringContext.getBean(PersonDao.class);
		Query query = new Query();
		InTableCdt cdt = new InTableCdt("depart");
		cdt.setCol("did");
		query.add(cdt);
		for(Person person:dao.find(query)){
			System.out.println(person.getPname());
		}
	}
	
	public void testInTable1(){
		PersonDao dao = SpringContext.getBean(PersonDao.class);
		Query query = new Query();
		InTableCdt cdt = new InTableCdt("depart1");
		cdt.setMainTableCol("did");
		cdt.setCol("did1");
		query.add(cdt);
		for(Person person:dao.find(query)){
			System.out.println(person.getPname());
		}
	}
	
	public void testInTableAndSimple(){
		PersonDao dao = SpringContext.getBean(PersonDao.class);
		Query query = new Query();
		InTableCdt cdt = new InTableCdt("depart1");
		cdt.setMainTableCol("did");
		cdt.setCol("did1");
		query.add(cdt);
		query.add(new SingleCdt("pid",1));
		for(Person person:dao.find(query)){
			System.out.println(person.getPname());
		}
	}
	
	
}
