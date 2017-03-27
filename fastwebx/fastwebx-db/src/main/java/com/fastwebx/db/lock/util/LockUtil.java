package com.fastwebx.db.lock.util;

import java.util.Date;

import com.fastwebx.common.exp.imp.AlreadyLock;
import com.fastwebx.db.dao.BaseDao;
import com.fastwebx.db.lock.inf.ILock;

/**
 * 锁工具类
 * @author mj
 */
public class LockUtil {
	public final static int maxTime = 5000;
	/**
	 * 锁住
	 * @param lock
	 * @param dao
	 */
	public static boolean lock(ILock lock,BaseDao dao){
		if(lock!=null){
			if(!isLock(lock)){
				lock.setLocked(true);
				lock.setLockedTime(new Date());
				lock.setMyLock(true);
				return dao.update(lock)>0;
				
			}else{
				if(lock.isMyLock()){
					return true;
				}
				throw new AlreadyLock();
			}
		}
		return false;
	}
	/**
	 * 释放锁
	 * @param lock
	 * @param dao
	 */
	public static void free(ILock lock,BaseDao dao){
		if(lock!=null){
			if(lock.getLocked()!=null && lock.getLocked()){
				lock.setLocked(false);
				lock.setMyLock(false);
				dao.update(lock);
			}
		}
	}
	/**
	 * 判断是否锁
	 * @param lock
	 * @return
	 */
	public static boolean isLock(ILock lock){
		if(lock==null) return false;
		if(lock.getLocked()==null 
				|| !(lock.getLocked())
				|| lock.getLockedTime()==null) return false;
		Date date = new Date();
		return (date.getTime()-lock.getLockedTime().getTime())<maxTime;
	}
	
}
