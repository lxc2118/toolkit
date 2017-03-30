package com.tg.db;

import java.util.List;

import com.tg.db.common.S;
import com.tg.db.core.CustomerContextHolder;
import com.tg.db.sync.sunrise.pojo.account.Account;
import com.tg.db.sync.sunrise.pojo.account.AccountDao;
import com.tg.db.sync.syncAuto.GiftSync;
import com.tg.db.sync.tgoms.pojo.gift.Gift;
import com.tg.db.sync.tgoms.pojo.gift.GiftDao;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestBase {

	public void testMultiDataSource() {
		Account accout = S.get(AccountDao.class).get(1);
		System.out.println(accout.getAccount());
		com.tg.db.sync.newtg.pojo.account.Account newAccout = S.get(com.tg.db.sync.newtg.pojo.account.AccountDao.class).get(1);
		System.out.println(newAccout.getAccount());
	}
	
	public void testLimit() {
		List<Account> list = (List<Account>) S.get(AccountDao.class).findLimit(10L);
		for(Account accout:list) {
			System.out.println(accout.getAccount());
		}
	}
	
	public void testTgoms(){
		List<Gift> list = (List<Gift>) S.get(GiftDao.class).findLimit(1L);
		for(Gift gift:list) {
			System.out.println(gift.getName());
		}
	}

	public void testSync() {
		new GiftSync().porcess();
	}
}
