package com.tg.db;

import org.mybatis.spring.SqlSessionTemplate;

import com.tg.db.common.S;
import com.tg.db.core.CustomSqlSessionTemplate;
import com.tg.db.sync.sunrise.pojo.account.Account;
import com.tg.db.sync.sunrise.pojo.account.AccountDao;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestBase {

	public void testApp() {
//		SpringContext.getBean(SqlSessionTemplate.class);
//		S.get(SqlSessionTemplate.class);
//		ac.getBean(Account.class);
//		System.out.println(S.get(SqlSessionTemplate.class).getSqlSessionFactory());
//		S.get(Account.class);
		Account accout = S.get(AccountDao.class).get(1);
		
//		accout.setId(1);
		System.out.println(accout.getAccount());
//		AccountDao dao = S.get(AccountDao.class);
//		System.out.println(S.get(AccountDao.class).get(1));
	}
	
}
