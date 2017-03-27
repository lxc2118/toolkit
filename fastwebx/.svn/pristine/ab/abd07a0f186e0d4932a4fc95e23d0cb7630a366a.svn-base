package com.fastwebx.db.lock.inf;

import java.util.Date;

import com.fastwebx.db.version.inf.IVersion;

/**
 * @author mj
 */
public interface ILock extends IVersion {
	/**
	 * 是否锁住，该字段需要保存到数据库
	 * @param val
	 */
	public void setLocked(Boolean val);
	/**
	 * 是否锁住，该字段需要保存到数据库
	 * @param val
	 */
	public Boolean getLocked();
	/**
	 * 锁住时间，超时用，该字段需要保存到数据库
	 * @return
	 */
	public Date getLockedTime();
	/**
	 * 锁住时间，超时用，该字段需要保存到数据库
	 * @return
	 */
	public void  setLockedTime(Date date);
	
	/**
	 * 表示是否是我锁的，该字段不能保存到数据库
	 * @param val
	 */
	public void setMyLock(boolean val); //表示是否是我锁的，该字段不能保存到数据库
	/**
	 * 表示是否是我锁的，该字段不能保存到数据库
	 * @param val
	 */
	public boolean isMyLock();
	
}
