package com.fastwebx.db.rowHandle.server;

import com.fastwebx.db.dao.BaseDao;
import com.fastwebx.db.query.Query;
import com.fastwebx.db.rowHandle.imp.ListRowHandle;

/**
 * 一个list 一个list地处理数据
 * list中数据太大会导致内存溢出
 * @author mj
 */
public abstract class ListRowHandleServer<T> {
	/**
	 * 进行处理
	 */
	public void process(){
		ListRowHandle<T> lrh = this.createHandle();
		this.acqDao().queryForHandle(this.createQuery(), lrh);
		lrh.processList();  	//最后处理一下
	}
	
	abstract protected BaseDao<T> acqDao();
	
	abstract protected Query createQuery();
	
	abstract protected ListRowHandle<T> createHandle();
}
