package com.fastwebx.db.dao;

import java.util.List;






import com.fastwebx.common.dao.ICrud;
import com.fastwebx.common.dao.ISimpleCrud;
import com.fastwebx.common.dao.inf.IPk;
import com.fastwebx.common.dao.inf.IQuery;
import com.fastwebx.db.query.Query;
/**
 * db 和 cache的联合类
 * @author mj
 *
 * @param <Pojo>
 */
public abstract class JoinDao<Pojo> implements ICrud<Pojo>{

	abstract protected ICrud<Pojo> getDbDao();
	abstract protected ISimpleCrud<Pojo> getCacheDao();
	
	@Override
	public int del(Pojo pojo) {
		return this.getDbDao().del(pojo);
	}

	@Override
	public int update(Pojo pojo) {
		
		return this.getDbDao().update(pojo);
	}

	@Override
	public Pojo get(Object pk) {
		Pojo ret = this.getCacheDao().get(pk);
		if(ret == null){
			ret = this.getDbDao().get(pk);
			if(ret!=null){
				this.getCacheDao().add(ret);
			}
		}
		return ret;
	}

	@Override
	public Pojo getByIPk(IPk ipk) {
		return get(ipk.acqPk());
	}

	@Override
	public List<Pojo> find(IQuery query) {
	
		return this.getDbDao().find(query);
	}

	@Override
	public int findCnt(IQuery query) {
		return this.getDbDao().findCnt(query);
	}

	@Override
	public void add(Pojo pojo) {
		this.getDbDao().add(pojo);
	}
}
