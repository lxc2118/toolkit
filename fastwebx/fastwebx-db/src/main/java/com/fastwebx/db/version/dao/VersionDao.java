package com.fastwebx.db.version.dao;

import org.springframework.dao.DuplicateKeyException;

import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.exp.AlreadyExist;
import com.fastwebx.common.exp.imp.WrongVersion;
import com.fastwebx.db.dao.BaseDao;
import com.fastwebx.db.version.inf.IVersion;

/**
 * 线程安全的dao
 * 支持多线程插入 和 乐观锁
 * @author mj
 */
public class VersionDao<Pojo  extends IVersion> extends BaseDao<Pojo> {
	
	
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

	
	


	public int updateWithExp(Pojo pojo) {
		
		int i = super.update(pojo);
		if(i==0) throw new WrongVersion();
		pojo.setVersion(pojo.getVersion()+1);
		return i;
	}

	
	public int delWithExp(Pojo pojo) {
		
		int i = super.del(pojo);
		if(i==0) throw new WrongVersion();
		return i;
	}

	/**
	 * 不抛出异常,版本不对会更新失败
	 * @param pojo
	 * @return
	 */
	@Override
	public int update(Pojo pojo) {
		
		int i = super.update(pojo);
		if(i>0)
			pojo.setVersion(pojo.getVersion()+1);
		return i;
	}

	
	
	
	
	
}
