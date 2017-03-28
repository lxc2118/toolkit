package com.tg.db;

import org.mybatis.spring.SqlSessionTemplate;

import com.tg.db.common.S;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestBase {

	public void testApp() {
//		SpringContext.getBean(SqlSessionTemplate.class);
		S.get(SqlSessionTemplate.class);
//		ac.getBean(AccountDao.class).get(1);
//		Account accout = ac.getBean(Account.class);
//		accout.setId(1);
//		System.out.println(accout.getId());
//		AccountDao dao = S.get(AccountDao.class);
//		System.out.println(S.get(AccountDao.class).get(1));
	}
	
	
}
