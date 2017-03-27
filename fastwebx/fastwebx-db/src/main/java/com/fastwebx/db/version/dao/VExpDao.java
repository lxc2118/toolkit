package com.fastwebx.db.version.dao;

import org.springframework.dao.DuplicateKeyException;

import com.fastwebx.common.exp.imp.WrongVersion;
import com.fastwebx.db.dao.BaseDao;
import com.fastwebx.db.keyCnt.inf.version.IVCopyReload;
import com.fastwebx.db.version.exp.VersionExp;
import com.fastwebx.db.version.inf.IVersion;

/**
 * @author mj
 */
public class VExpDao<Pojo  extends IVCopyReload> extends BaseDao<Pojo> {

	@Override
	public Pojo getOrAdd(Pojo pojo) {
		pojo.setVersion(0);
		return super.getOrAdd(pojo);
	}





	@Override
	public void add(Pojo pojo) {
		try{
			pojo.setVersion(0);
			super.add(pojo);
		}catch(DuplicateKeyException e){
			e.printStackTrace();
			throw new WrongVersion();
		}
	}

	
	

	@Override
	public int update(Pojo pojo) {
		
		int i = super.update(pojo);
		if(i==0) throw new VersionExp(pojo);
		pojo.setVersion(pojo.getVersion()+1);
		return i;
	}

	@Override
	public int del(Pojo pojo) {
		
		int i = super.del(pojo);
		if(i==0) throw new VersionExp(pojo);
		return i;
	}

}
