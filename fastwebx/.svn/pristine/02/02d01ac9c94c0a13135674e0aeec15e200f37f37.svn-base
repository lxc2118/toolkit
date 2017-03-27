package com.fastwebx.db.state;

import com.fastwebx.db.dao.BaseDao;
import com.fastwebx.db.version.dao.VersionDao;

/**
 * 具有锁功能的状态类
 * @author mj
 */
public interface IStateLocker extends IState {
	public final static int locked = 999;
	BaseDao acqDao();
	default boolean lock(){
		this.setState(locked);
		return this.acqDao().update(this)>0;
	}
}
