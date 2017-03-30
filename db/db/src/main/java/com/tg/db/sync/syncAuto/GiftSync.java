package com.tg.db.sync.syncAuto;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.tg.db.sync.AbsSync;
import com.tg.db.sync.sunrise.pojo.gift.Gift;

@Repository
public class GiftSync extends AbsSync<com.tg.db.sync.tgoms.pojo.gift.Gift,Gift>{

	@Override
	public Gift doProcess(com.tg.db.sync.tgoms.pojo.gift.Gift s) {
		Gift gift = new Gift();
		gift.setId(s.getId());
		gift.setName(s.getName());
		gift.setStockNum(s.getStockNum());
		gift.setStatus(s.getStatus());
		gift.setPrice(s.getPrice());
		gift.setCostPrice(s.getCostPrice());
		gift.setCreateTime(s.getCreateTime());
		gift.setUpdateTime(s.getUpdateTime());
		gift.setGiftCategoryId(s.getGiftCategoryId());
		gift.setPic(s.getPic());
		gift.setDefaultType(s.getDefaultType());
		return gift;
	}

}
