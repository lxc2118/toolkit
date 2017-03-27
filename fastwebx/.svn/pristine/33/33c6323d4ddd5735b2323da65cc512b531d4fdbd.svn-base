package com.fastwebx.db.rowHandle.imp;

import java.util.ArrayList;
import java.util.List;

import com.fastwebx.db.rowHandle.AbsRowHandle;

/**
 * @author mj
 */
public abstract class ListRowHandle<T> extends AbsRowHandle<T> {

	protected List<T> list = new ArrayList<T>();
	protected T last = null;
	
	@Override
	protected void process(T t) {
		if(!check$(t)) return;
		if(last!=null){
			if(!equal(last,t)){
				if(list.size()>0)
					processList();
				list.clear();
			}
		}
		list.add(t);
		processSingle(t);
		last = t;

	}
	/**
	 * 过滤
	 * @param t
	 * @return
	 */
	protected boolean check$(T t) {
		return true;
	}
	/**
	 * 单条处理
	 * @param t
	 */
	protected void processSingle(T t) {
		
		
	}
	/**
	 * 处理封装好的数据
	 * @param list2
	 */
	public abstract void processList() ;
	/**
	 * 判断是否在同一个list里面
	 * @param last2
	 * @param t
	 * @return
	 */
	protected abstract boolean equal(T last2, T t) ;

}
