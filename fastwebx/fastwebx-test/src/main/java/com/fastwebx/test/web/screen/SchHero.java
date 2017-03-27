package com.fastwebx.test.web.screen;

import java.util.Map;

import javax.annotation.Resource;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Params;
import com.fastwebx.test.hero.pojo.Hero;
import com.fastwebx.test.menpai.dao.MenpaiDao;
import com.fastwebx.test.menpai.pojo.Menpai;
import com.fastwebx.test.web.schParam.SchHeroParam;
import com.fastwebx.web.SchCtrl;

public class SchHero extends SchCtrl<Hero>{
	@Resource
	private MenpaiDao menpaiDao;
	
	public MenpaiDao getMenpaiDao() {
		return menpaiDao;
	}

	public void setMenpaiDao(MenpaiDao menpaiDao) {
		this.menpaiDao = menpaiDao;
	}

	public void execute(@Params SchHeroParam param,Context context){
		context.put("result",this.search(param) );
		
		
	}

	@Override
	protected void wearCloth(Map map, Hero pojo) {
		Menpai menpai = menpaiDao.get(pojo.getMid());
		if(menpai!=null)
			map.put("mname", menpai.getMname());
		else
			map.put("mname", "");
	}
	
	
}
