package com.fastwebx.test.twoTable;

import com.fastwebx.common.context.$;
import com.fastwebx.db.condition.Condition;
import com.fastwebx.db.condition.JoinCdt;
import com.fastwebx.db.condition.SingleCdt;
import com.fastwebx.db.condition.tableJoin.TableJoin;
import com.fastwebx.db.condition.tableJoin.TwoTable;
import com.fastwebx.db.query.Query;
import com.fastwebx.db.test.TestBase;
import com.fastwebx.test.person.dao.PersonDao;
import com.fastwebx.test.person.pojo.Person;

public class TwoTableTest extends TestBase {
	public void testJoin(){
		
		Query query = new Query();
		query.add(create("jname","清洁工"));
		query.add(create("jid",1));
		query.add(create1("dname","财务部"));
		for(Person person:$.get(PersonDao.class).find(query)){
			System.out.println(person.getPname());
		}
	}
	private Condition create1(String colName,Object value){
		JoinCdt cdt = new JoinCdt();
		cdt.setCdt(new SingleCdt(colName,value));
		TableJoin table = new TableJoin();
		table.setTableName("depart");
		table.setJoinTableCol("did");
		cdt.setTable(table);
		return cdt;
	}
	private Condition create(String colName,Object value){
		JoinCdt cdt = new JoinCdt();
		TwoTable table = new TwoTable();
		table.setTableName("job");
		table.setMiddle2Join("jid");
		table.setMiddle2Main("pid");
		table.setMiddleTableName("person_job");
		
		cdt.setTable(table);
		SingleCdt scdt = new SingleCdt(colName,value);
		cdt.setCdt(scdt);
		return cdt;
	}
}
