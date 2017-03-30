package com.tg.db.sync;

import java.util.List;

import com.tg.db.common.BaseDao;
import com.tg.db.common.IPk;
import com.tg.db.common.SuperClassHunter;

/**
 * 同步父类
 * @author lxc
 *
 * @param <S> 来源对象
 * @param <T> 目标对象
 */
public abstract class AbsSync<S extends IPk, T extends IPk>{

	protected BaseDao<S> sourceDao;
	
	protected BaseDao<T> targetDao;
	
	protected Long limit = 0L;
	
	public AbsSync(){
		List<Class> list = SuperClassHunter.get().acqClasses(this);
		sourceDao = (BaseDao<S>) com.tg.db.common.S.get(list.get(0).getName()+"Dao");
		targetDao = (BaseDao<T>) com.tg.db.common.S.get(list.get(1).getName()+"Dao");
	}
	
	public void porcess() {
		List<S> list = (List<S>) acqList(limit);
		while (list.size() != 0) {
			for(S s:list) {
				targetDao.getOrAdd(this.doProcess(s));
			}
			limit += 20L;
			list = (List<S>) acqList(limit);
		}
	}
	
	protected abstract T doProcess(S s);
	
	public List acqList(Long limit) {
		return (List) sourceDao.findLimit(limit);
	}
	
	
}
